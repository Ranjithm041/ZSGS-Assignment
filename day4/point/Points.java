package com.day4.point;

import java.util.Scanner;

public class Points {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Circle circle = new Circle();
		
		System.out.print("Enter x : ");
		int x = sc.nextInt();
		
		System.out.print("Enter y : ");
		int y = sc.nextInt();
		
		circle.setPoints(x, y);
		
		System.out.print("Enter the radius : ");
		int radius = sc.nextInt();
		
		circle.printPoints();
		
		System.out.println("The radius is : "+ circle.getRadius());
		System.out.println("The Area is : "+ circle.area());
		
		sc.close();
	}
}
