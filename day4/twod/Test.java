/*
 * 
 * 2. Construct a base class called twoD contains x and y and methods to read and write the x and y.
 *  Create another class called threeD which is derived from twoD and also contains z and write methods to read and write z.
 *   Also write a method to find the distance of two threeD Points.
sqrt((x2-x1)^2+(y2-y1)^2+(z2-z1)^2)
In main:
Create one ThreeD object using the default constructor.
Use the setters to set x, y, and z.
Create the second ThreeD object using the constructor with three arguments.
in the TwoD class:
Add a cout statement to the TwoD default constructor with a message "TwoD default constructor"
Add a cout statement to other TwoD constructor with a message "TwoD constructor with two arguments"
 * 
 * 
 * 
 */

package com.day4.twod;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// it will call the default constructor
		TwoD twod1 = new TwoD();
		
		System.out.print("Enter the x value : ");
		int x = sc.nextInt();
		
		System.out.print("Enter the y value : ");
		int y = sc.nextInt();
		
		// it will call the parameterized constructor
		TwoD twod2 = new TwoD(x,y);
		
		// it will call the default constructor
		ThreeD threed1 = new ThreeD();
		System.out.print("Enter the z value : ");
		int z = sc.nextInt();
		threed1.setX(x);
		threed1.setY(y);
		threed1.setZ(z);
		
		// another three d object
		ThreeD threed2 = new ThreeD(x,y,z);
		
		// to find distance
		System.out.println("The distance of the two object is : "+threed1.findDistance(threed2));
	}

}
