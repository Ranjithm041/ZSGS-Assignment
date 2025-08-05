/*
 * 
 * 1. We want to store the information about different vehicles. Create a class named Vehicle with two data member named mileage 
 * and price. Create its two subclasses
---Car with data members to store ownership cost, warranty (by years), seating capacity and fuel type (diesel or petrol).
---Bike with data members to store the number of cylinders, number of gears, cooling type(air, liquid or oil),
 wheel type(alloys or spokes) and fuel tank size(in inches)
Make another two subclasses Audi and Ford of Car, each having a data member to store the model type.
Next, make two subclasses Bajaj and TVS, each having a data member to store the make-type.
Now, store and print the information of an Audi and a Ford car 
(i.e. model type, ownership cost, warranty, seating capacity, fuel type, mileage and price.) Do the same for a Bajaj and a TVS bike.
 * 
 * 
 * 
 */

package com.day4;
import com.day4.vehicle.*;
public class Task1 {
	public static void main(String[] args) {
        Ford ford = new Ford("EcoSport", 1700000, 2, 6, FuelType.DIESEL, 18, 1750000);
        System.out.println("-------Ford Details--------");
        System.out.println(ford);
        System.out.println();
        
        System.out.println("-------Audi Details--------");
        Audi audi = new Audi("A6", 3400000, 4, 5, FuelType.DIESEL, 15, 3600000);
        System.out.println(audi);
        System.out.println();
        
        System.out.println("-------Bajaj Details--------");
        Bajaj bajaj = new Bajaj("Pulsar NS200", 1, CoolingType.LIQUID, 5, WheelType.ALLOYS, 40, 120000);
        System.out.println(bajaj);
        System.out.println();
        
        System.out.println("-------Tvs Details--------");
        TVS tvs = new TVS("Apache RTR 160", 1, CoolingType.AIR, 5, WheelType.ALLOYS, 45, 110000);
        System.out.println(tvs);
        System.out.println();
    }
}
