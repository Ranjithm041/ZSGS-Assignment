package com.day4.vehicle;

public class TVS extends Bike{
	public String makeType;
	public TVS(String makeType, int numberOfCylinders, CoolingType coolingType, int numberOfGears, WheelType wheelType, int mileage, int price) {
		super.numberOfCylinders=numberOfCylinders;
		super.numberOfGears=numberOfGears;
		super.coolingType=coolingType;
		super.wheelType=wheelType;
		super.mileage=mileage;
		super.price=price;
		this.makeType=makeType;
	}
	@Override
	public String toString() {
		return 
		           "Make Type = " + makeType + 
		           "\n Number of Cylinders = " + numberOfCylinders +
		           "\n Cooling Type = " + coolingType +
		           "\n Number of Gears = " + numberOfGears +
		           "\n Wheel Type = " + wheelType + 
		           "\n Mileage = " + mileage + " kmpl" +
		           "\n Price = " + price ;
	}
}