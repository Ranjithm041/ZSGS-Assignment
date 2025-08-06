/*
4. Design a Java Ticket Booking System using polymorphism where
 Bus, Train, and Flight tickets share a common method but implement booking differently.
 */

package com.day5.ticketbooking;
import java.util.Scanner;
public class TicketBooking {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			System.out.println("\n--------- Ticket Booking ----------");
			System.out.println("1. Bus Ticket Booking");
			System.out.println("2. Train Ticket Booking");
			System.out.println("3. Flight Ticket Booking");
			System.out.println("0. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
				case 1 : {
					System.out.print("Enter Passenger Name: ");
					String name = sc.nextLine();
					System.out.print("Enter Source: ");
					String source = sc.nextLine();
					System.out.print("Enter Destination: ");
					String destination = sc.nextLine();
					System.out.print("Enter Seat Number (0-63): ");
					int seat = sc.nextInt();

					if (seat < 0 || seat >= 64) {
						System.out.println("Invalid seat number. Please enter between 0-63.");
						break;
					}
					if(BusTicket.seats[seat]) {
						System.out.println("seat "+seat+" is already booked !.");
						break;
					}
					BusTicket bus = new BusTicket(name, source, destination, seat);
					System.out.println("------Bus Ticket Booking------");
					bus.bookTicket();
					break;
				}
				case 2 : {
					System.out.print("Enter Passenger Name: ");
					String name = sc.nextLine();
					System.out.print("Enter Source: ");
					String source = sc.nextLine();
					System.out.print("Enter Destination: ");
					String destination = sc.nextLine();
					System.out.print("Enter Coach Number (0-299): ");
					int coach = sc.nextInt();

					if (coach < 0 || coach >= 300) {
						System.out.println("Invalid coach number. Please enter between 0-299.");
						break;
					}
					if(TrainTicket.seats[coach]) {
						System.out.println("coach "+coach+" is already booked !.");
						break;
					}
					TrainTicket train = new TrainTicket(name, source, destination, coach);
					System.out.println("------Train Ticket Booking------");
					train.bookTicket();
					break;
				}
				case 3 : {
					System.out.print("Enter Passenger Name: ");
					String name = sc.nextLine();
					System.out.print("Enter Source: ");
					String source = sc.nextLine();
					System.out.print("Enter Destination: ");
					String destination = sc.nextLine();
					System.out.print("Enter Flight Class Letter (A-Z): ");
					char classLetter = sc.nextLine().toUpperCase().charAt(0);
					System.out.print("Enter Class Number (0-5): ");
					byte classNumber = sc.nextByte();

					if (classLetter < 'A' || classLetter > 'Z' || classNumber < 0 || classNumber >= 6) {
						System.out.println("Invalid class entry. Letter: A-Z and Number: 0-5 only.");
						break;
					}
					if(FlightTicket.flightClass[classLetter][classNumber]) {
						System.out.println("class "+classLetter+""+classNumber+" is already booked !.");
						break;
					}
					FlightTicket flight = new FlightTicket(name, source, destination, classLetter, classNumber);
					System.out.println("------Flight Ticket Booking------");
					flight.bookTicket();
					break;
				}
				case 0 : {
					System.out.println("Exiting..."); 
					System.exit(0);
				}
				default : System.out.println("Invalid choice!");
			}
		} while (choice != 0);

		sc.close();
	}
}
