/*
 *  
 * 4. Design the Vehicle class that stores information about a vehicle such as 
 * its vehicle ID, brand name, and price, such that it can internally
 *  keep track of how many vehicles have been created so far, 
 * without requiring manual counting from outside the class.
 * 
 */

public class Task4 {
    public static void main(String[] args) {
        Vehicle car = new Vehicle(101, "Rolls Royse", 72323456.56f);
        Vehicle bike = new Vehicle(102, "R15 v4", 223456.893f);
        Vehicle van = new Vehicle(103, "Mahindra", 323456.363f);

        System.out.println(Vehicle.count); // this will print the number of object creation
    }
}

class Vehicle{
    static int count=0; // this will keep track the object creation count
    int id;
    String brandName;
    float price;
    public Vehicle(int id, String brandName, float price){
        count++; // increase object creation count
        this.id        = id;
        this.brandName = brandName;
        this.price     = price;
    }
}
