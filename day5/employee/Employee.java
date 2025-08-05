package com.day5.employee;

public abstract class Employee { 
	protected String employeeName;
	protected String designation;
	protected int employeeId;
	public Employee(String employeeName, int employeeId, String designation) {
		this.employeeName = employeeName;
		this.employeeId   = employeeId;
		this.designation  = designation;
	}
	protected abstract double calculateSalary() ;
	
	public void printDetails() {
		System.out.println("Name : "+this.employeeName);
		System.out.println("Id : "+this.employeeId);
		System.out.println("Designation : "+this.designation);	
	}
}
