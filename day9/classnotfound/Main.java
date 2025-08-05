package com.day9.classnotfound;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.day9.Hello");
		}catch(ClassNotFoundException e) {
			System.out.println("Error Class Not Found  : "+e);
		}
	}

}
