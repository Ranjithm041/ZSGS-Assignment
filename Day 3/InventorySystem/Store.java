package InventorySystem;

import java.util.ArrayList;
import java.util.List;


public class Store{
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