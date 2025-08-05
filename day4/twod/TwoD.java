
package com.day4.twod;

public class TwoD {
	private int x;
	private int y;
	public TwoD() {
		System.out.println("Executed the TwoD default constructor");
	}
	public TwoD(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println("Executed the TwoD constructor with two arguments");
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
}
