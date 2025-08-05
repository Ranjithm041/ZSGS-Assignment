package com.day6.travelbookingsystem;
import java.util.Scanner;
import com.day6.travelbookingsystem.user.*;
import com.day6.travelbookingsystem.booking.*;
public class TravelBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int choice =0;
		
		do {
			System.out.println("--------Travel Booking System------");
			System.out.println("1. Book Ticket");
			System.out.println("0. Exit");
			System.out.print("Enter the choice : ");
			choice = sc.nextInt();
			switch(choice) {
					case 1:{
						//	public User(String name, String emailId, byte age,String source, int destinationKey)
						sc.nextLine();
						System.out.print("Enter the name : ");
						String name = sc.nextLine();
						System.out.print("Enter the email Id : ");
						String email = sc.nextLine();
						System.out.print("Enter the age : ");
						byte age = sc.nextByte();
						sc.nextLine();
						System.out.print("Enter the source : ");
						String source = sc.nextLine();
						System.out.println("----- Available Tourist Destinations -----");
						for (int i = 0; i < Ticket.destinations.length; i++) {
						    System.out.println((i + 1) + ". " + Ticket.destinations[i]);
						}
						System.out.println("Enter the destination key (1-10) : ");
						int key = sc.nextInt();
						
						User user = new User(name, email, age, source, key);
						
						System.out.println("-------------Booking Status-------------");
						user.getBookingStatus();
						break;
					}
					case 0:{
						System.out.println("Exiting........");
						System.exit(0);
					}
					default : System.out.println("Invalid choice !");
			}
			
		}while(choice!=0);
	}

}
