package com.day7.ticketbookingsystem;

public class FlightTicket implements Ticket{
	public static boolean[][] flightClass=new boolean[26][6];
	private char classSign;
	private byte classNumber;
	private String passengerName;
	private String source;
	private String destination;
	
	public FlightTicket(char classSign, byte classNumber, String passengerName, String source, String destination) {
		this.classSign = classSign;
		this.classNumber = classNumber;
		this.passengerName = passengerName;
		this.source = source;
		this.destination = destination;
		FlightTicket.flightClass[classSign-'A'][classNumber]=true;
	}

	
	
	@Override
	public void bookTicket() {
		System.out.println("Flight Ticket Booked Successfullly!");
		System.out.println("Passenger Name : "+this.passengerName);
		System.out.println("Source : "+this.source);
		System.out.println("Destination : "+this.destination);
		System.out.printf("Flight Class : %c%d",this.classSign,this.classNumber);
	}
}
