/*
 1. Illustrates with an example of using Singleton class.
 */
package com.day8.singletonclass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s==s2);
	}

}
