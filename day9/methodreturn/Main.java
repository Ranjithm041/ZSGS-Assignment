package com.day9.methodreturn;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getMarks());  // just call the getMarks
	}
	public static int getMarks() {
		try {
			System.out.println("returned the number");  // try block executed first
			return 90;	// it will return after finally executed
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Finally executed !");
		}
		return 35;
	}
}
