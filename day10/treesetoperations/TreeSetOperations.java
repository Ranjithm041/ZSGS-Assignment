/*
 4. Write a Java program to,
a. create a new tree set, add some colours (string) and print out the tree set.
b. iterate through all elements in a tree set.
c. add all the elements of a specified tree set to another tree set.
d. create a reverse order view of the elements contained in a given tree set.
e. get the first and last elements in a tree set.
f. clone a tree set list to another tree set.
g. get the number of elements in a tree set.
h. compare two tree sets.
Create a TreeSet that stores a set of numbers,   
i. find the numbers less than 7 in a tree set.
j. get the element in a tree set which is greater than or equal to the given element.
k. get the element in a tree set which is less than or equal to the given element.
l. get the element in a tree set which is strictly greater than or equal to the given element.
m. get an element in a tree set which is strictly less than the given element.
n. retrieve and remove the first element of a tree set.
o. retrieve and remove the last element of a tree set.
p. remove a given element from a tree set.
 */
package com.day10.treesetoperations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetOperations {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		TreeSet<String> colours = new TreeSet<>();
		TreeSet<String> clonedColours = null;
		
		TreeSet<Integer> numbers = new TreeSet<>();
int choice =0;
		
		do {
		 	System.out.println("-------- TreeSet Operations Menu --------");
            System.out.println("1. Add colours and print TreeSet");
            System.out.println("2. Iterate through all elements");
            System.out.println("3. Add elements from another TreeSet");
            System.out.println("4. Reverse order view");
            System.out.println("5. Get first and last elements");
            System.out.println("6. Clone TreeSet to another TreeSet");
            System.out.println("7. Get number of elements");
            System.out.println("8. Compare two TreeSets");
            System.out.println("9. Add numbers to TreeSet");
            System.out.println("10. Find numbers < 7");
            System.out.println("11. Get element ≥ given number");
            System.out.println("12. Get element ≤ given number");
            System.out.println("13. Get element > given number");
            System.out.println("14. Get element < given number");
            System.out.println("15. Retrieve and remove first element");
            System.out.println("16. Retrieve and remove last element");
            System.out.println("17. Remove a given element");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
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
				iterateTreeSet(colours);
				break;
			}
			case 3 :{
				sc.nextLine();
				TreeSet<String> newColours = new TreeSet<>();
				System.out.print("Enter the number of elements for new treeset : ");
				int n = sc.nextInt();
				sc.nextLine();
				addColours(newColours,n);
				colours.addAll(newColours);
				break;
			}
			case 4 :{
				System.out.print("Reversed Order is : ");
				for(String colour : colours.descendingSet()) {
					System.out.print(colour + " ");
				}
				break;
			}
			case 5 :{
				System.out.println("The first element is : "+colours.pollFirst());
				System.out.println("The last element is : "+colours.pollLast());
				break;
			}
			case 6 :{
				clonedColours =(TreeSet<String>) colours.clone();
				System.out.println("Cloned : "+clonedColours);
				break;
			}
			case 7 :{
				System.out.println("The number of elements : "+colours.size());
				break;
			}
			case 8 :{
				if(clonedColours==null) {
					System.out.println("Create clone first !");
					break;
				}
				boolean isEqual = colours.equals(clonedColours);
				System.out.println(isEqual ? "Equal " : "Not Equal");
				break;
			}
			case 9 :{
				sc.nextLine();
				System.out.print("Enter the number of elements : ");
				int n = sc.nextInt();
				sc.nextLine();
				addNumbers(numbers,n);
				System.out.println("Numbers added successfully!");
				break;
			}
			case 10 :{
				System.out.println("Numbers < 7 are : "+numbers.headSet(7));
				break;
			}
			case 11 :{
				sc.nextLine();
				System.out.print("Enter the number : ");
				int n = sc.nextInt();
				System.out.println("Greater than or = "+n+" is : "+numbers.ceiling(n));
				break;
			}
			case 12 :{
				sc.nextLine();
				System.out.print("Enter the number : ");
				int n = sc.nextInt();
				System.out.println("Less than or = "+n+" is : "+numbers.floor(n));
				break;
			}
			case 13 :{
				sc.nextLine();
				System.out.print("Enter the number : ");
				int n = sc.nextInt();
				System.out.println("Greater than "+n+" is : "+numbers.higher(n));
				break;
			}
			case 14 :{
				sc.nextLine();
				System.out.print("Enter the number : ");
				int n = sc.nextInt();
				System.out.println("Less than  "+n+" is : "+numbers.lower(n));
				break;
			}
			case 15 :{
				System.out.println("Removed first element is  : "+numbers.pollFirst());
				break;
			}
			case 16 :{
				System.out.println("Removed first element is  : "+numbers.pollLast());
				break;
			}
			case 17 :{
				sc.nextLine();
				System.out.print("Enter the number : ");
				int n = sc.nextInt();
				if(numbers.remove(n)) System.out.println("Removed Element is : "+n);
				else System.out.println(n+" not found");
				break;
			}
			case 18 :{
				System.out.println("The elements are : \n"+numbers);
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
	
	// add colours in the treeset
	public static void addColours(TreeSet<String> colours , int n) {
		while(n-->0) {
			System.out.print("Enter the colour : ");
			colours.add(sc.nextLine());
		}
		
		System.out.println(colours); // print the collections
	}
	// add numbers in the treeset
	public static void addNumbers(TreeSet<Integer> numbers , int n) {
		while(n-->0) {
			System.out.print("Enter the number : ");
			numbers.add(sc.nextInt());
		}
		
		System.out.println(numbers); // print the collections
	}
	
	// iterate the list
	public static void iterateTreeSet(TreeSet<String> colours) {
		int i=1;
		for(String colour : colours) {
			System.out.println(i++ + ". "+ colour);
		}
	}
		

}
