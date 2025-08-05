/*
 1. Write a Java program
a. to create a new array list, add some colours (string) and print out the collection.
b. to iterate through all elements in an array list.
c. to insert an element into the array list at the first position.
d. to retrieve an element (at a specified index) from a given array list.
e. to update specific array element by given element.
f. to remove the third element from an array list.
g. to search an element in an array list.
h. to sort a given array list.
i. to copy one array list into another.
j. to shuffle elements in an array list.
 */

package com.day10.arraylistoperations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListOperation {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<String> colours = new ArrayList<>();
		ArrayList<String> copy;
		
		int choice =0;
		
		do {
			System.out.println("-------ArrayList Operation--------");
			System.out.println("1. Add colours");
			System.out.println("2. Iterate the ArrayList");
			System.out.println("3. Insert colour at first index");
			System.out.println("4. Retrive an element");
			System.out.println("5. Update  an element");
			System.out.println("6. Remove the Third element");
			System.out.println("7. Search an Element");
			System.out.println("8. Sort the ArrayList");
			System.out.println("9. Copy ArrayList");
			System.out.println("10. Shuffle ArrayList");
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
				iterateList(colours);
				break;
			}
			case 3 :{
				sc.nextLine();
				System.out.print("Enter the colour : ");
				String colour = sc.nextLine();
				colours.add(0,colour);
				System.out.println("Inserted Successfully!");
				break;
			}
			case 4 :{
				sc.nextLine();
				System.out.print("Enter the index : ");
				int index = sc.nextInt();
				if(index<0 || index>colours.size()-1) {
					System.out.println("Invalid index !");
					break;
				}
				System.out.println("Retreived element is : "+colours.get(index));
				break;
			}
			case 5 :{
				sc.nextLine();
				System.out.print("Enter the colour : ");
				String colour = sc.nextLine();
				int index = colours.indexOf(colour);
				if(index==-1) {
					System.out.println("There is no colours in the list!");
					break;
				}
				System.out.print("Enter the colour : ");
				colours.set(index, sc.nextLine());
				System.out.println("Colour updated successfully!");
				break;
			}
			case 6 :{
				if(colours.size()>2) {
					colours.remove(2);
					System.out.println("Removed successfully!");
					break;
				}
				System.out.println("The list size is less than 3");
				break;
			}
			case 7 :{
				sc.nextLine();
				System.out.print("Enter the Colour : ");
				String colour = sc.nextLine();
				
				if(colours.contains(colour)) System.out.println("Colour found in the list");
				else  System.out.println("Colour Not found in the list");
				break;
			}
			case 8 :{
				Collections.sort(colours);
				System.out.println(colours);
				System.out.println("Sorted Successfully!");
				break;
			}
			case 9 :{
				copy=new ArrayList<>(colours);
				System.out.println(copy);
				System.out.println("copied successfully!");
				break;
			}
			case 10 :{
				Collections.shuffle(colours);
				System.out.println(colours);
				System.out.println("Suffled successfully!");
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
	
	// add colours in the list
	public static void addColours(ArrayList<String> colours , int n) {
		while(n-->0) {
			System.out.print("Enter the colour : ");
			colours.add(sc.nextLine());
		}
		
		System.out.println(colours); // print the collections
	}
	
	// iterate the list
	public static void iterateList(ArrayList<String> colours) {
		for(int i=0;i<colours.size();i++) {
			System.out.println((i+1)+".  "+colours.get(i));
		}
	}
	
	
}
