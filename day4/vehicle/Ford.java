package com.day4.vehicle;

public class Ford extends Car{
	public String modelType;

	public Ford(String modelType, int cost, int warranty, int seatCapacity, FuelType fuelType, int mileage, int price) {
		super.cost=cost;
		super.fuelType=fuelType;
		super.seatCapacity=seatCapacity;
		super.warranty=warranty;
		super.mileage=mileage;
		super.price=price;
		this.modelType = modelType;
	}
	
	@Override
	public String toString() {
		return 
		           "Model Type = " + modelType + 
		           "\n Cost = " + cost +
		           "\n Warranty = " + warranty + " years" +
		           "\n Seat Capacity = " + seatCapacity +
		           "\n Fuel Type = " + fuelType + 
		           "\n Mileage = " + mileage + " kmpl" +
		           "\n Price = " + price ;
	}
}