package com.day7.employeeinterface;

public class PartTimeEmployee implements Employee {
	private String name;
	private int id;
	private String designation;
	private double hoursWorked;
	private double ratePerHour;
	
	
	
	public PartTimeEmployee(String name, int id, String designation, double hoursWorked, double ratePerHour) {
		this.name = name;
		this.id = id;
		this.designation = designation;
		this.hoursWorked = hoursWorked;
		this.ratePerHour = ratePerHour;
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getRatePerHour() {
		return ratePerHour;
	}

	public void setRatePerHour(double ratePerHour) {
		this.ratePerHour = ratePerHour;
	}

	@Override
	public double calculateSalary() {
		return this.hoursWorked * this.ratePerHour;
	}
	
	@Override
	public void printDetails() {
		System.out.println("Name : "+this.name);
		System.out.println("Id : "+this.id);
		System.out.println("Designation : "+this.designation);
		System.out.println("Hours Worked : "+this.hoursWorked);
		System.out.println("Rate Per Hour : "+this.ratePerHour);
		System.out.println("Total salary : "+this.calculateSalary());
	}
}
