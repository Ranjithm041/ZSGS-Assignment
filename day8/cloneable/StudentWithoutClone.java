
package com.day8.cloneable;

public class StudentWithoutClone {
	String name ;
	int rollNumber;
	String department;
	public StudentWithoutClone(String name, int rollNumber, String department) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.department=department;
	}
	@Override 
	public String toString() {
		return "Student Name : "+this.name+"\nStudent RollNumber : "+this.rollNumber+"\nStudent Department : "+this.department;
	}
}