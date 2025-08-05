package com.day5.ticketbooking;

public class FlightTicket extends Ticket{
	public static boolean[][] flightClass=new boolean[26][6];
	public char classSign;
	public byte classNumber;
	public FlightTicket(String passengerName, String source, String destination, char classSign, byte classNumber) {
		super(passengerName,source,destination);
//		if(flightClass[classSign-'A'][classNumber]) System.out.printf("%c%d is already booked !",classSign,classNumber);
//		else {
			this.classSign = classSign;
			this.classNumber = classNumber;
			FlightTicket.flightClass[classSign-'A'][classNumber]=true;
//		}
	}
	
	@Override
	public void bookTicket() {
		System.out.println("Flight Ticket Booked Successfullly!");
		System.out.println("Passenger Name : "+super.passengerName);
		System.out.println("Source : "+super.source);
		System.out.println("Destination : "+super.destination);
		System.out.printf("Flight Class : %c%d",this.classSign,this.classNumber);
	}
}
