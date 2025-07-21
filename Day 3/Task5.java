/*
 * 
 * 5. Design a simple inventory system in Java using object-oriented principles that demonstrates 
 * the use of static variables and object containment.
‌
Create two classes:
---Store
---Product
‌
Requirements:
The Store class should have:
a. storeName and storeLocation as static variables since they are common to all products in the store.
b. A static method setStoreDetails(String name, String location) to initialize the static variables.
c. A static method displayStoreDetails() to print store details.
d. A list to maintain multiple Product objects (i.e., the store contains many products).
e. A method addProduct(Product product) to add products to the store.
f. A method displayAllProducts() to display details of all products.
‌
The Product class should have:
a. Product ID, name, price, and quantity as instance variables.
b. A constructor to initialize these fields.
c. A method displayProduct() to show product details.
‌
Task:
Implement the above classes and demonstrate their use in the main() method by:
a. Setting store details once.
b. Creating multiple product objects.
c. Adding them to the store.
d. Displaying store and product information.
‌
Also Check how many .class files are generated.
 * 
 * 
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        // created the store object for class Store
        Scanner sc = new Scanner(System.in);
        Store store = new Store();
        int choice=0;

        do {
            System.out.println("========= Inventory Menu =========");
            System.out.println("1. Set Store Details");
            System.out.println("2. Add Product");
            System.out.println("3. Display Store Details");
            System.out.println("4. Display All Products");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            // using switch statement 
            switch (choice) {
                case 1 : {
                    System.out.print("Enter store name: ");
                    String storeName = sc.nextLine();
                    sc.nextLine();
                    System.out.print("Enter store location: ");
                    String storeLocation = sc.nextLine();

                    Store.setStoreDetails(storeName, storeLocation);
                    break;
                }

                case 2 : {
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

                case 3 :{
                    store.displayStoreDetails();
                    break;
                }

                case 4 :{
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

class Store{
    // here i decalred the instance varible for store 
    private static String name;
    private static String location; 
    private List<Product> products = new ArrayList<>();

    // this method will add product in the list
    public void addProduct(Product product){
            boolean found = false;
            for(Product p : products){
                if(p.getId()==product.getId()){
                    int q = p.getQuantity();
                    p.setQuantity(q+(product.getQuantity()));
                    found = true;
                    break;
                }
            }
        
        if(!found)
        products.add(product);
    }

    // this method will display all product in the store
    public void displayAllProducts(){
        for(Product p : products){
            p.displayProduct();
        }
    }

    // this method will store the Store details
    public static void setStoreDetails(String storeName, String storeLocation){
        name     = storeName;
        location = storeLocation;
    }

    // this method will display about the store
    public static void displayStoreDetails(){
        System.out.println("Store name is : "+name);
        System.out.println("Store location is : "+location);
    }
}

class Product{
    // instance varibles 
    private int id;
    private String name;
    private float price;
    private int quantity;

    // constructor for initialize the instance value
    public Product(int id, String name, float price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // here this method will display the product details 
   public void displayProduct() {
    System.out.printf("| %-6d | %-15s | %8.2f | %8d |\n", id, name, price, quantity);
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}