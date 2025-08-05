package com.day7.banksystem;

public class Customer{
	private String name;
	private int id;
	private byte age;
	private String dob;
	public Customer(String name, int id, byte age, String dob) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.dob = dob;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
}
