package com.day7.employeeabstract;
import java.util.List;
import java.util.ArrayList;
public abstract class Employee { 
	public static List<FullTimeEmployee> fteRecord= new ArrayList<>();
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
