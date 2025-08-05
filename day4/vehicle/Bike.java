/*
 * 
 * ---Bike with data members to store the number of cylinders, number of gears, cooling type(air, liquid or oil),
 *  wheel type(alloys or spokes) and fuel tank size(in inches)
 * 
 * Next, make two subclasses Bajaj and TVS, each having a data member to store the make-type.
Now, store and print the information of an Audi and a Ford car (i.e. model type, ownership cost,
 warranty, seating capacity, fuel type, mileage and price.) Do the same for a Bajaj and a TVS bike.
 */

package com.day4.vehicle;

public class Bike extends Vehicle{
	public int numberOfCylinders;
	public int numberOfGears;
	public CoolingType coolingType;
	public WheelType wheelType;
	public float fuelSize;
}



