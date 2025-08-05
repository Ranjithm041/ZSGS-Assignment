/*
 3. Write a Java program to,
a. append the specified element to the end of a hash set.
b. iterate through all elements in a hash list.
c. get the number of elements in a hash set.
d. empty the hash set.
e. test a hash set is empty or not.
f. clone a hash set to another hash set.
g. convert a hash set to an array.
h. convert a hash set to a tree set.
i. convert a hash set to a List/ArrayList.
j. compare two hash set.
 */

package com.day10.hashsetoperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class HashSetOperations {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		HashSet<String> animals = new HashSet<>();
		HashSet<String> cloned = null;
		String[] array;
		ArrayList<String> arrayList;
		TreeSet<String> treeSet;
		int choice =0;
		
		do {
			System.out.println("-------HashSet Operation--------");
			System.out.println("1. Add Element");
			System.out.println("2. Iterate the HashSet");
			System.out.println("3. Get the number of elements");
			System.out.println("4. Empty the HashSet");
			System.out.println("5. Test HashSet is empty or not");
			System.out.println("6. Clone a Hashset to another Hashset");
			System.out.println("7. Convert a HashSet to an array");
			System.out.println("8. Convert a HashSet to TreeSet");
			System.out.println("9. Convert a HashSet to an ArrayList");
			System.out.println("10. Compare two HashSet");
			System.out.println("0. Exit");
			System.out.print("Enter the choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1 ->{
				sc.nextLine();
				System.out.print("Enter the number of elements : ");
				int n = sc.nextInt();
				sc.nextLine();
				addElements(animals,n);
				System.out.println("Animals added successfully!");
				break;
			}
			case 2 ->{
				System.out.println("Animals are : ");
				iterateHashSet(animals);
				break;
			}
			case 3 ->{
				System.out.println("The number of Animals : "+animals.size());
				break;
			}
			case 4 ->{
				animals.clear();
				System.out.println("Animals are cleared");
				break;
			}
			case 5 ->{
				if(animals.isEmpty()) System.out.println("There is no Animals");
				else System.out.println("Some Animals are there!");
				break;
			}
			case 6 ->{
				cloned =(HashSet<String>) animals.clone();
				System.out.println("Clone : "+ cloned);
				break;
			}
			case 7 ->{
				array = animals.toArray(new String[0]);
				System.out.println("Array : "+Arrays.toString(array));
				break;
			}
			case 8 ->{
				treeSet = new TreeSet<>(animals);
				System.out.println("Converted TreeSet is (order) : "+treeSet);
				break;
			}
			case 9 ->{
				arrayList = new ArrayList<>(animals);
				System.out.println("Converted ArrayList : "+arrayList);
				break;
			}
			case 10 ->{
				if(cloned==null) {
					System.out.println("Create clone first !");
					break;
				}
				boolean isEqual = animals.equals(cloned);
				System.out.println(isEqual ? "Equal " : "Not Equal");
				break;
			}
			case 0 ->{
				System.out.println("Exiting.....");
				System.exit(0);
			}
			default -> System.out.println("Invalid choice !");
			}
		}while(choice!=0);
		sc.close();
	}
	private static void iterateHashSet(HashSet<String> animals) {
		for(String animal : animals) {
			System.out.println(animal);
		}
		
	}
	private static void addElements(HashSet<String> animals, int n) {
		while(n-->0) {
			System.out.print("Enter the element : ");
			String animal = sc.nextLine();
			animals.add(animal);
			System.out.println();
		}
	}

}
