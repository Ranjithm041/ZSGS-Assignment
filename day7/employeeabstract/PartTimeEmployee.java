package com.day7.employeeabstract;

public class PartTimeEmployee extends Employee {
	protected double hoursWorked;
	protected double ratePerHour;
	
	public PartTimeEmployee(String empName, int empId, String designation, double hoursWorked, double ratePerHour) {
		super(empName,empId,designation);
		this.hoursWorked=hoursWorked;
		this.ratePerHour = ratePerHour;
	}
	
	@Override
	public double calculateSalary() {
		return this.hoursWorked * this.ratePerHour;
	}
	
	@Override
	public void printDetails() {
		super.printDetails();
		System.out.println("Hours Worked : "+this.hoursWorked);
		System.out.println("Rate Per Hour : "+this.ratePerHour);
		System.out.println("Total salary : "+this.calculateSalary());
	}
}
