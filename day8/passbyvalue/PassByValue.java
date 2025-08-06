/*
 6. Develop a Java program to illustrate pass-by-value.
 */
package com.day8.passbyvalue;

public class PassByValue {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 23;
		modify(age); // it pass the age value in to the modify method 
		System.out.println("Original age "+age);
	}
	public static void modify(int age) { // here created another temp variable , so do not affect the original value
		age = age+10;
		System.out.println("In modify method : "+age);
	}
}
