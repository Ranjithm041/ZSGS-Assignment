package com.day11.inventorysystem;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class AppendableObjectOutputStream extends ObjectOutputStream {

	public AppendableObjectOutputStream(OutputStream out) throws IOException {
		super(out);
	}

	@Override
	public void writeStreamHeader() throws IOException {
		reset();
	}
}

public class Main {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Path path = Paths.get("src/com/day11/inventorysystem/Product.dat");
		File file = path.toFile();
		int choice;

		do {
			System.out.println("\n=== Product Inventory Management ===");
			System.out.println("1. Add Product");
			System.out.println("2. View All Products");
			System.out.println("3. Search Product");
			System.out.println("4. Update Product");
			System.out.println("5. Delete Product");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1 -> {
				// ➤ Add Product Input
				System.out.print("Enter Product ID: ");
				int id = sc.nextInt();
				sc.nextLine(); // consume newline

				System.out.print("Enter Product Name: ");
				String name = sc.nextLine();

				System.out.print("Enter Product Price: ");
				double price = sc.nextDouble();

				System.out.print("Enter Product Quantity: ");
				int quantity = sc.nextInt();

				Product p = new Product(id, name, quantity, price);
				addProduct(file, p);
				System.out.println("Product Added Successfully!");
			}
			case 2 -> viewAllProducts(file);

			case 3 -> {
				System.out.print("Enter Product ID to Search: ");
				int searchId = sc.nextInt();
				Product found = searchProduct(file, searchId);
				if (found != null)
					System.out.println(found);
				else
					System.out.println("Product not found.");
			}

			case 4 -> {
				System.out.print("Enter Product ID to Update: ");
				int updateId = sc.nextInt();
				updateProduct(file, updateId);
			}

			case 5 -> {
				System.out.print("Enter Product ID to Delete: ");
				int deleteId = sc.nextInt();
				deleteProduct(file, deleteId);
			}

			case 0 -> System.out.println("Exiting... Thank you!");

			default -> System.out.println("Invalid choice Try again.");
			}

		} while (choice != 0);

	}

	public static void addProduct(File file, Product product) {
		if (searchProduct(file, product.getId()) != null) {
			System.out.println("Product with ID " + product.getId() + " already exists!");
			return;
		}
		try {
			FileOutputStream fos = new FileOutputStream(file, true);
			ObjectOutputStream oos;
			if (file.length() == 0)
				oos = new ObjectOutputStream(fos);
			else
				oos = new AppendableObjectOutputStream(fos);
			oos.writeObject(product);
			oos.close();
			fos.close();
			System.out.println("Product Serialized");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void viewAllProducts(File file) {
		boolean isthere = false;
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			while (true) {
				try {
					Product p = (Product) ois.readObject();
					isthere = true;
					System.out.println(p);
				} catch (EOFException e) {
					break;
				}
			}
			if (!isthere) {
				System.out.println("No products found!");
				return;
			}
			ois.close();
			fis.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Product searchProduct(File file, int productId) {
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			while (true) {
				try {
					Product p = (Product) ois.readObject();
					if (p.getId() == productId) {
						System.out.println("Product found!");
						return p;
					}
				} catch (EOFException e) {
					break;
				}
			}
			ois.close();
			fis.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void updateProduct(File file, int productId) {
		List<Product> products = new ArrayList<>();
		boolean updated = false;

		try (FileInputStream fis = new FileInputStream(file); ObjectInputStream ois = new ObjectInputStream(fis)) {
			while (true) {
				try {
					Product p = (Product) ois.readObject();
					if (p.getId() == productId) {
						System.out.println("1. Update Price");
						System.out.println("2. Update Quantity");
						System.out.print("Enter the choice: ");
						int choice = sc.nextInt();

						if (choice == 1) {
							System.out.print("Enter the new Price: ");
							double price = sc.nextDouble();
							p.setPrice(price);
						} else if (choice == 2) {
							System.out.print("Enter the new Quantity: ");
							int quantity = sc.nextInt();
							p.setQuantity(quantity);
						} else {
							System.out.println("Invalid choice.");
						}

						updated = true;
					}
					products.add(p);
				} catch (EOFException e) {
					break;
				}
			}
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		try (FileOutputStream fos = new FileOutputStream(file); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			for (Product p : products) {
				oos.writeObject(p);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (updated)
			System.out.println("Product Updated successfully!");
		else
			System.out.println("Product Not found!");

	}

	public static void deleteProduct(File file, int productId) {
		List<Product> products = new ArrayList<>();
		boolean deleted = false;
		try (FileInputStream fis = new FileInputStream(file); ObjectInputStream ois = new ObjectInputStream(fis);) {

			while (true) {
				try {
					Product p = (Product) ois.readObject();
					if (p.getId() == productId) {
						deleted = true;
						continue;
					}
					products.add(p);
				} catch (EOFException e) {
					break;
				}
			}
		} catch (EOFException e) {
			System.out.println(e.getMessage());
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		try (FileOutputStream fos = new FileOutputStream(file); ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			for (Product p : products) {
				oos.writeObject(p);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (deleted)
			System.out.println("Product Deleted successfully!");
		else
			System.out.println("Product Not found !");
	}
}
