package com.day7.employeeabstract;

public class FullTimeEmployee extends Employee {
	protected double monthlySalary;
	protected double bonus;
	
	public FullTimeEmployee(String empName, int empId, String designation, double monthlySalary, double bonus) {
		super(empName,empId,designation);
		this.monthlySalary=monthlySalary;
		this.bonus = bonus;
	}
	
	@Override
	public double calculateSalary() {
		return this.monthlySalary + this.bonus;
	}
	
	@Override
	public void printDetails() {
		super.printDetails();
		System.out.println("Monthly Salary : "+this.monthlySalary);
		System.out.println("Bonus : "+this.bonus);
		System.out.println("Total Salary : "+this.calculateSalary());
	}
}
