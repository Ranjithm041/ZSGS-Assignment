package com.day7.employeeinterface;

public class FullTimeEmployee implements Employee {
	private String name;
	private int id;
	private String designation;
	private double monthlySalary;
	private double bonus;
	
	
	
	public FullTimeEmployee(String name, int id, String designation, double monthlySalary, double bonus) {
		this.name = name;
		this.id = id;
		this.designation = designation;
		this.monthlySalary = monthlySalary;
		this.bonus = bonus;
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

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public double calculateSalary() {
		return this.monthlySalary + this.bonus;
	}
	
	@Override
	public void printDetails() {
		System.out.println("Name : "+this.name);
		System.out.println("Id : "+this.id);
		System.out.println("Designation : "+this.designation);	
		System.out.println("Monthly Salary : "+this.monthlySalary);
		System.out.println("Bonus : "+this.bonus);
		System.out.println("Total Salary : "+this.calculateSalary());
	}
}
