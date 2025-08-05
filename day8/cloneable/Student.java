package com.day8.cloneable;
import java.lang.Cloneable;
public class Student implements Cloneable {
	String name ;
	int rollNumber;
	String department;
	public Student(String name, int rollNumber, String department) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.department=department;
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	@Override 
	public String toString() {
		return "Student Name : "+this.name+"\nStudent RollNumber : "+this.rollNumber+"\nStudent Department : "+this.department;
	}
}