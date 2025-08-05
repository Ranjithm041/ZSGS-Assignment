/*
 * 1. Illustrates with an example of using Singleton class.
 * 
 */
package com.day8.singletonclass;

public class Singleton {
	private static Singleton instance;
	private Singleton() {
		System.out.println("Object created!");
	}
	public static Singleton getInstance() {
		if(instance==null) {
			instance= new Singleton();
		}
			return instance;
	}
}
