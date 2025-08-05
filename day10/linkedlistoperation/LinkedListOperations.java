/*
 2. Write a Java program to,
a. append the specified element to the end of a linked list.
b. iterate through all elements in a linked list.
c. iterate through all elements in a linked list starting at the specified position.
d. iterate a linked list in reverse order.
e. insert the specified element at the specified position in the linked list.
f. insert elements into the linked list at the first and last position.
g. insert the specified element at the front of a linked list.
h. insert the specified element at the end of a linked list.
i. insert some elements at the specified position into a linked list.
j. get the first and last occurrence of the specified elements in a linked list.
 */

package com.day10.linkedlistoperation;

import java.util.*;
public class LinkedListOperations {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<>();
		
		
		int choice =0;
		
		do {
			System.out.println("---------LinkedList Operation----------");
			System.out.println("1. Add Element");
			System.out.println("2. Iterate the LinkedList");
			System.out.println("3. Iterate from specified index in LinkedList");
			System.out.println("4. Iterate the LinkedList as reverse order");
			System.out.println("5. Insert an element specified index");
			System.out.println("6. Insert first and last of the LinkedList");
			System.out.println("7. Insert the first index");
			System.out.println("8. Insert the last index");
			System.out.println("9. Insert the few elements specified index");
			System.out.println("10. Get element from first and last element");
			System.out.println("0. Exit");
			System.out.print("Enter the choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1 :{
				sc.nextLine();
				System.out.print("Enter the number of element : ");
				int n = sc.nextInt();
				sc.nextLine();
				addElements(list, n);
				System.out.println("Element added successfully!");
				break;
			}
			case 2 :{
				System.out.print("Elements are : ");
				iterateList(list);
				break;
			}
			case 3 :{
				sc.nextLine();
				System.out.print("Enter the index : ");
				int index = sc.nextInt();
				if(index<0 || index>list.size()-1) {
					System.out.println("Invalid index !");
					break;
				}
				Iterator<Integer> it = list.listIterator(index);
				System.out.print("Elements are : ");
				while(it.hasNext()) {
					System.out.print(it.next()+" ");
				}
				break;
			}
			case 4 :{
				Iterator<Integer> it = list.descendingIterator();
				System.out.print("Elements are : ");
				while(it.hasNext()) {
					System.out.print(it.next()+" ");
				}
				break;
			}
			case 5 :{
				sc.nextLine();
				System.out.print("Enter the index : ");
				int index = sc.nextInt();
				if(index<0 || index>list.size()-1) {
					System.out.println("Invalid index !");
					break;
				}
				System.out.print("Enter the element : ");
				int element = sc.nextInt();
				list.add(index, element);
				break;
			}
			case 6 :{
				sc.nextLine();
				System.out.print("Enter the element : ");
				int element = sc.nextInt();
				list.addFirst(element);
				System.out.println("Element added at first successfully!");
				System.out.print("Enter the element : ");
				element = sc.nextInt();
				list.addLast(element);
				System.out.println("Element added at last successfully!");
				break;
			}
			case 7 :{
				sc.nextLine();
				System.out.print("Enter the element : ");
				int element = sc.nextInt();
				list.addFirst(element);
				System.out.println("Element added at first successfully!");
				break;
			}
			case 8 :{
				sc.nextLine();
				System.out.print("Enter the element : ");
				int element = sc.nextInt();
				list.addLast(element);
				System.out.println("Element added at last successfully!");
				break;
			}
			case 9 :{
				sc.nextLine();
				System.out.print("Enter the number of elements : ");
				int n =sc.nextInt();
				LinkedList<Integer> newElements = new LinkedList<>();
				addElements(newElements,n);
				System.out.print("Enter the index : ");
				n=sc.nextInt();
				if(n<0 || n>list.size()-1) {
					System.out.println("Invalid index !");
					break;
				}
			    list.addAll(3, newElements); 
				break;
			}
			case 10 :{
				if(list.isEmpty()) {
					System.out.println("Linked list is empty !");
					break;
				}
				System.out.println("The first element is : "+list.getFirst());
				System.out.println("The last element is : "+list.getLast());
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

	private static void iterateList(LinkedList<Integer> list) {
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}
	public static void addElements(LinkedList<Integer> list, int n) {
		while(n-->0) {
			System.out.print("Enter the element : ");
			int element = sc.nextInt();
			list.add(element);
			System.out.println();
		}
	}

}
