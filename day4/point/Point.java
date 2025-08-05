/*
 * 
 * class Point{
public:
Point(){int=0;int=0;} //default constructor
void setPoint(int,int); //set coordinates
int getX() const {return x;} //get x coordinates
int getY() const {return y;} //get y coordinates
void printPoint(); // print (x,y) coordinates
private int x;
private int y;
};
 * 
 * 
 * 
 */

package com.day4.point;

public class Point {
	private int x;
	private int y;
	public Point() {
		x=0;
		y=0;
	}
	public int getY() {
		return y;
	}
	public int getX() {
		return x;
	}
	public void setPoints(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void printPoints() {
		System.out.println("point x : "+this.x);
		System.out.println("point y : "+this.y);
	}
}

class Circle extends Point{
	private int radius;
	public Circle() {
		setRadius(0);
	}
	public int getRadius() {
		return this.radius;
	}
	public void setRadius(int radius) {
		if(radius<=0) this.radius=1;
		else this.radius = radius;
	}
	public double area() {
		return (3.14)*(this.radius*this.radius);
	}
	
}
