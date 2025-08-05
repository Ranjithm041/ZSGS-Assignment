package com.day4.shape;

public class ShapeTest {
	public static void main(String[] args) {
		// created for all class object
		
		Shape shape = new Shape();
        Polygon polygon = new Polygon();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        Square square = new Square();
        
        // call display method for each object
        shape.display();      
        polygon.display();     
        rectangle.display();  
        triangle.display();    
        square.display();      
	}
}
