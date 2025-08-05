package com.day8.tostring;

public class Student {
	String name ;
	int rollNumber;
	public Student(String name, int rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
	}
	
	// if i not override the the toString method it will return Student object hashcode
	@Override 
	public String toString() {
		return "Student Name : "+this.name+"\nStudent rollNumber : "+this.rollNumber;
	}
}
