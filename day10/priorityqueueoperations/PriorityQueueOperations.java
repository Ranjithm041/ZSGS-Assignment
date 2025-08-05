/*
   5. Write a Java program to,
1. create a new priority queue, add some colors (string) and print out the elements of the priority queue.
2. iterate through all elements in priority queue.
3. add all the elements of a priority queue to another priority queue.
4. insert a given element into a priority queue.
5. remove all the elements from a priority queue.
6. count the number of elements in a priority queue.
7. compare two priority queues.
8. retrieve the first element of the priority queue.
9. retrieve and remove the first element.
10. convert a priority queue to an array containing all of the elements of the queue.
 */
package com.day10.priorityqueueoperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueOperations {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> colours = new PriorityQueue<>();
		PriorityQueue<String> newColours =null;
		String[] array;
		int choice =0;
		
		do {
			System.out.println("\n---- PriorityQueue Operations ----");
            System.out.println("1. Add colors and print the queue");
            System.out.println("2. Iterate through all elements");
            System.out.println("3. Add all elements from another PQ");
            System.out.println("4. Insert a specific element");
            System.out.println("5. Remove all elements");
            System.out.println("6. Count number of elements");
            System.out.println("7. Compare two priority queues");
            System.out.println("8. Retrieve (peek) first element");
            System.out.println("9. Retrieve and remove first element");
            System.out.println("10. Convert priority queue to array");
            System.out.println("0. Exit");
			System.out.print("Enter the choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1 :{
				sc.nextLine();
				System.out.print("Enter the number of colours : ");
				int n = sc.nextInt();
				sc.nextLine();
				addColours(colours,n);
				System.out.println("colours added successfully!");
				break;
			}
			case 2 :{
				System.out.println("Colours are : ");
				iteratePriorityQueue(colours);
				break;
			}
			case 3 :{
				sc.nextLine();
				System.out.print("Enter the number of colours : ");
				int n = sc.nextInt();
				sc.nextLine();
				newColours = new PriorityQueue<>();
				addColours(newColours,n);
				colours.addAll(newColours);
				System.out.println("Inserted Successfully!");
				break;
			}
			case 4 :{
				sc.nextLine();
				System.out.print("Enter the colour : ");
				String colour = sc.nextLine();
				colours.add(colour);
				System.out.println("Inserted Successfully!");
				break;
			}
			case 5 :{
				colours.clear();
				System.out.println("PriorityQueue cleared successfully!");
				break;
			}
			case 6 :{
				System.out.println("The total elements are : "+colours.size());
				break;
			}
			case 7 :{
				if(colours.equals(newColours)) System.out.println("Equal");
				else System.out.println("Not Equal");
				break;
			}
			case 8 :{
				System.out.println("retreived elements is : "+colours.peek());
				break;
			}
			case 9 :{
				System.out.println("removed elements is : "+colours.poll());
				break;
			}
			case 10 :{
				array = colours.toArray(new String[0]);
				System.out.println(Arrays.toString(array));
				break;
			}
			case 0 :{
				System.out.println("Exiting.....");
				System.exit(0);
			}
			default : System.out.println("Invalid choice !");
			}
		}while(choice!=0);
		sc.close();
	}

	// add colours in the PriorityQueue
	public static void addColours(PriorityQueue<String> colours , int n) {
		while(n-->0) {
			System.out.print("Enter the colour : ");
			colours.add(sc.nextLine());
		}
		
		System.out.println(colours); // print the collections
	}
	
	// iterate the PriorityQueue
	public static void iteratePriorityQueue(PriorityQueue<String> colours) {
		for(String colour : colours) {
			System.out.print(colour+" ");
		}
	}
}
