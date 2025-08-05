package com.day8.serialization;

import java.io.Serializable;

public class Product implements Serializable {
	private int id;
	private String name;
	private int quantity;
	private double price;
	
	public Product(int id, String name, int quantity, double price) {
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	
	public String toString() {
		return "Id : "+this.id+"\nName : "+this.name+"\nQuantity : "+this.quantity+"\nPrice : "+this.price;
	}
}
