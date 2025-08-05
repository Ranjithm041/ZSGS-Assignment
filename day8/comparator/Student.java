package com.day8.comparator;

public class Student {
	String name ;
	int rollNumber;
	public Student(String name, int rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
	}
	@Override 
	public String toString() {
		return "Student Name : "+this.name+"\nStudent rollNumber : "+this.rollNumber;
	}
}
