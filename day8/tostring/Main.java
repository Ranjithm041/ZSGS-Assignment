/*
 7. Develop a Java program to illustrate the usage of toString() method.
 */


package com.day8.tostring;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("Ranjith",123);
		System.out.println(student);  //wihtout toString overriden it will return the hashcode like that : Student@6f539caf
	}

}
