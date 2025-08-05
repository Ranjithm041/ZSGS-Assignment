/*
 * 5. Develop a Java application for a Ticket Booking System that allows users to book tickets for different 
types of transportation modes such as Bus, Train, and Flight.
Define a common interface or abstract class`Ticket with a method`bookTicket() that each transportation mode must implement differently.
Create classes`BusTicket,`TrainTicket, and`FlightTicket that extend the abstract class or implement the interface.
Demonstrate runtime polymorphism by calling the`bookTicket() method using a reference of the base class/interface.
 * 
 */

package com.day7.ticketbookingsystem;

public interface Ticket {
	 abstract void bookTicket();
}
