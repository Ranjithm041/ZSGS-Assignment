package com.day8.clone;
import java.lang.Cloneable;
public class Student implements Cloneable {
	String name ;
	int rollNumber;
	public Student(String name, int rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	@Override 
	public String toString() {
		return "Student Name : "+this.name+"\nStudent rollNumber : "+this.rollNumber;
	}
}