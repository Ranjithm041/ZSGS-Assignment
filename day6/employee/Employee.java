/*
 * ‌
3. Design a class`Employee with private data members: employee ID, name, designation, department, and monthly salary.
 Use proper getter and setter methods to access and update these fields.
  Add a method to calculate and return the annual salary of the employee.
 * 
 * 
 */

package com.day6.employee;

public class Employee {
	private int id;
	private String name;
	private String designation;
	private String department;
	private double monthlySalary;
	public Employee(int id, String name, String designation, String department, double monthlySalary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.department = department;
		this.monthlySalary = monthlySalary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	public double getAnnualSalary() {
		return this.monthlySalary*12;
	}
	
}
