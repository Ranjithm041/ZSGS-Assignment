package InventorySystem;


import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        // created the store object for class Store
        Scanner sc = new Scanner(System.in);
        Store store = new Store();
        int choice=0;

        System.out.println("Set Store Details");
            System.out.print("Enter store name: ");
                    String storeName = sc.nextLine();
                    System.out.print("Enter store location: ");
                    String storeLocation = sc.nextLine();
                    Store.setStoreDetails(storeName, storeLocation);
        System.out.println("Set Store Details");
            System.out.print("Enter store name: ");
                    String storeName = sc.nextLine();
                    System.out.print("Enter store location: ");
                    String storeLocation = sc.nextLine();
                    Store.setStoreDetails(storeName, storeLocation);
        do {
            System.out.println("========= Inventory Menu =========");       
            System.out.println("1. Add Product");
            System.out.println("2. Display Store Details");
            System.out.println("3. Display All Products");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            // using switch statement 
            switch (choice) {
                case 1 : {
                    System.out.print("Enter product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter product name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter product price: ");
                    float price = sc.nextFloat();

                    System.out.print("Enter product quantity: ");
                    int quantity = sc.nextInt();

                    Product product = new Product(id, name, price, quantity);
                    store.addProduct(product);
                    break;

                }

                case 2 :{
                    store.displayStoreDetails();
                    break;
                }

                case 3 :{
                    store.displayAllProducts();
                    break;
                }

                case 0 :{
                    System.out.println("Exiting...");
                    System.exit(0);
                } 

                default : System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}
