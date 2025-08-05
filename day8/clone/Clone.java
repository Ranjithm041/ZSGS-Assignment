/*
 * 5. Write a program to illustrate the usage of clone() and find out what kind of copy it will make.
 */
package com.day8.clone;

public class Clone {
	public static void main(String[] args) throws CloneNotSupportedException {
		//here i created on object
		Student ranjith = new Student("Ranjith",123);
		Student maran = (Student) ranjith.clone(); // clone ranjith into maran (deep copy)
		System.out.println(ranjith==maran);  //check if it same or not;
		maran.name="Maaran"; // change the name;
		System.out.println(ranjith);  // print the ranjith object
		System.out.println(maran);  // print the maran object
		System.out.println(ranjith==maran); //check if it same or not
	}
}
