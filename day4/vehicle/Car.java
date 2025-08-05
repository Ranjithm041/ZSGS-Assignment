/*
 * 
 * ---Car with data members to store ownership cost, warranty (by years), seating capacity and fuel type (diesel or petrol).
 * Make another two subclasses Audi and Ford of Car, each having a data member to store the model type.
Next, make two subclasses Bajaj and TVS, each having a data member to store the make-type.
Now, store and print the information of an Audi and a Ford car (i.e. model type, ownership cost,
 warranty, seating capacity, fuel type, mileage and price.) Do the same for a Bajaj and a TVS bike.
 * 
 */

package com.day4.vehicle;

public class Car extends Vehicle{
		public double cost;
		public int warranty;
		public int seatCapacity;
		public FuelType fuelType;
}
