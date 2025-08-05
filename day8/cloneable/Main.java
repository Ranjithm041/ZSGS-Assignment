/*
 * 8. Write a Java program to demonstrate the concept of object cloning using the clone() method.
--->Create a class Student with fields like name, rollNo, and department.
--->Attempt to clone an object of this class using the clone() method.
--->Catch and handle the CloneNotSupportedException if thrown.
***Also find out and explain why the class must implement the Cloneable interface to avoid CloneNotSupportedException.
-->Your program should clearly illustrate:
a. What happens if Cloneable is not implemented
b. How the error is resolved by implementing Cloneable
 */
package com.day8.cloneable;
import java.lang.Cloneable;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentWithoutClone student1= new StudentWithoutClone("Ranjith", 123, "CSE");
		
		try {
			StudentWithoutClone student2= (StudentWithoutClone) student1.clone();
			System.out.println("cloned");
		}catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
		
		
	}

}
