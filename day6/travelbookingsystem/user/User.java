package com.day6.travelbookingsystem.user;
import com.day6.travelbookingsystem.booking.*;
public class User {
	public String name ;
	public byte age;
	public String emailId;
	public Ticket ticket ;
	public User(String name, String emailId, byte age,String source, int destinationKey) {
		this.name=name;
		this.emailId=emailId;
		this.age=age;
		ticket = new Ticket();
		ticket.setSource(source);
		ticket.setDestination(destinationKey-1);
	}
	public void getBookingStatus() {
		System.out.println("Booked Successfully!");
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+this.age);
		System.out.println("Email Id : "+this.emailId);
		System.out.println("Source : "+ticket.getSource());
		System.out.println("Destination : "+ticket.destinations[ticket.getDestination()]);
		System.out.println("Fare : "+ticket.getFares(ticket.getDestination()));
	}
}
