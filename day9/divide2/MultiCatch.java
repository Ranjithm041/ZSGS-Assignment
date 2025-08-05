/*
 * 2. Demonstrate multiple catch blocks: accept two numbers as strings, then convert them to integers, 
 * and perform division, 
and catch the following exceptions: InputMismatchException, NumberFormatException, ArithmeticException and Exception.
 * 
 */
package com.day9.divide2;
import java.util.InputMismatchException;
import java.util.Scanner;
public class MultiCatch {

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
			int divide = val1/val2;
			System.out.println("Divided values : "+divide);
		}catch(InputMismatchException e) {
			System.out.println("Error : "+e.getMessage());
		}catch(NumberFormatException e) {
			System.out.println("Error : "+e.getMessage());
		}catch(ArithmeticException e) {
			System.out.println("Error : "+e.getMessage());
		}catch(Exception e) {
			System.out.println("Error : "+e.getMessage());
		}
		
	}

}
