/*
 * 
 * 5. Create a class named Shape with a method that prints "This is a shape". 
 * Create another class named Polygon inheriting the Shape class with the same method that prints "Polygon is a shape".
 *  Create two other classes named Rectangle and Triangle having the same method which prints "Rectangle is a polygon" and 
 *  "Triangle is a polygon" respectively. Again, make another class named Square having the same method which prints
 *   "Square is a rectangle".
Now, try calling the method by the object of each of these classes.
 * 
 * 
 */

package com.day4.shape;

//base class
public class Shape {
	protected void display() {
		System.out.println("This is a shape");
	}
}

//derived from Shape
class Polygon extends Shape{
	@Override
	protected void display() {
		System.out.println("Polygon is a shape");
	}
}

//derived from Polygon
class Rectangle extends Polygon{
	@Override
	protected void display() {
		System.out.println("Rectangle is a polygon");
	}
}

//derived from Polygon
class Triangle extends Polygon{
	@Override
	protected void display() {
		System.out.println("Triangle is a polygon");
	}
}

//derived from Rectangle
class Square extends Rectangle{
	@Override
	protected void display() {
		System.out.println("Square is a rectangle");
	}
}

