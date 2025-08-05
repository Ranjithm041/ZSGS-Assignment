/*
 * 
 * ‌
7. Write a Java program that shows exception propagation across multiple methods (method1 calls method2 calls method3, 
which throws the exception). Handle the exception in method1.
‌
 * 
 */

package com.day9.multimethod;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
	}
	static void method1() {
		try {
			method2();
		}catch(ArithmeticException e) {
			System.out.println("Exception : "+e);
		}
	}
	
	static void method2() {
		method3();
	}
	
	static void method3() {
		int result = 10/0;
		System.out.println(result);
	}

}
