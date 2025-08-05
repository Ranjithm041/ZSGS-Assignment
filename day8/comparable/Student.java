package com.day8.comparable;

public class Student implements Comparable<Student>{
	String name;
	int rollNumber;
	Student(String name , int rollNumber){
		this.name = name;
		this.rollNumber= rollNumber;
	}
	@Override
	public int compareTo(Student s) {
		return this.name.compareTo(s.name);
	}
	@Override
	public String toString() {
		return "Student Name : "+this.name+"\nStudent rollNumber : "+this.rollNumber;
	}
}
