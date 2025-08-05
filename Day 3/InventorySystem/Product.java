package InventorySystem;



public class Product{
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
