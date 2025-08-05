/*
 * 
 * ‌
2. Can we override private method, constructor, static method, final method? Illustrate with an example.
 * 
 */

package com.day5.override;

public class Family {
	public Family() {
		System.out.println("Family constructor ");
	}
	public Family() {
		System.out.println("Overidden Family constructor ");
	}
	private void privateMethod() {
		System.out.println("Family private method");
	}
	public static void staticOverride() {
		System.out.println("Static method from Family");
	}
	public final void finalMethod() {
		System.out.println("final method from Family");
	}
}
class Father extends Family{
	@Override
	private void priavteMethod() {
		System.out.println("Father ovveriden method from Family");
	}
	@Override
	public static void staticOverride() {
		System.out.println("Static method from Father ");
	}
	@Override
	public void finalMethod() {
		System.out.println("final method from Father");
	}
}