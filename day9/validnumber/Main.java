/*
 * 
 * 4. Write a method to parse a string to an integer.
 *  Throw an exception if the string is not a valid number.
 Handle it using try-catch.
 * 
 */

package com.day9.validnumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number 1 : ");
		String num1 = sc.nextLine();
		System.out.print("Enter the number 2 : ");
		String num2 = sc.nextLine();
		try {
			int val1 = Integer.parseInt(num1);
			int val2 = Integer.parseInt(num2);
			int qoutient = val1/val2;
			System.out.println("Qoutient : "+qoutient);
		}catch(NumberFormatException e) {
			System.out.println("Exception : "+e);
		}catch(ArithmeticException e) {
			System.out.println("Exception : "+e);
		}
	}

}
