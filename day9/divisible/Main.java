/*
 * 
 * 1. int[] arr = {2, 5, 1, 4, 0, 7};
int quotient = arr[7] / arr[4];
Develop a Java program which handles any unexpected situations that may arise during execution.
‌
 * 
 * 
 */

package com.day9.divisible;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 5, 1, 4, 0, 7};
		
		try {
			int quotient = arr[7] / arr[4] ;
			System.out.println(quotient);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
