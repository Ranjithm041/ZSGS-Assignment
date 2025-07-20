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

public class Task5 {
    public static void main(String[] args) {
        // created the store object for class Store
        Store store = new Store();

        // here i set the store details
        store.setStoreDetails("Ranjith store", "Mathalamparai");
        

        // here i created the multiple products
        Product note = new Product(101, "note", 45, 2);
        Product pen = new Product(102, "pen", 10, 10);
        Product bottle = new Product(101, "bottle", 105, 1);
        Product box = new Product(101, "lunch box", 100, 1);


        // here i adding them to the store.
        store.addProduct(note);
        store.addProduct(pen);
        store.addProduct(bottle);
        store.addProduct(box);

        // here i displaey about the store details
        store.displayStoreDetails();

        // here i diplayed about the product information
        store.displayAllProducts();
    }
}

class Store{
    // here i decalred the instance varible for store 
    private static String name;
    private static String location; 
    private List<Product> products = new ArrayList<>();

    // this method will add product in the list
    public void addProduct(Product product){
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
    public void displayProduct(){
        System.out.println(
            "Product : \n"+"id : "+this.id+" name : "+this.name+" quantity : "+this.quantity+" price : "+this.price
        );
    }

}