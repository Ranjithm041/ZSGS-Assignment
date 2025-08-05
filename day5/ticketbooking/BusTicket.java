package com.day5.ticketbooking;

public class BusTicket extends Ticket {
	public static boolean[] seats=new boolean[64];
	public int seatNumber;
	public BusTicket(String passengerName, String source, String destination, int seatNumber) {
		super(passengerName,source,destination);
//		if(seats[seatNumber]) System.out.printf("%d is already booked !",seatNumber);
//		else {
			this.seatNumber = seatNumber;
			BusTicket.seats[seatNumber]=true;
//		}
	}
	
	@Override
	public void bookTicket() {
		System.out.println("Bus Ticket Booked Successfullly!");
		System.out.println("Passenger Name : "+super.passengerName);
		System.out.println("Source : "+super.source);
		System.out.println("Destination : "+super.destination);
		System.out.println("Seat Number : "+this.seatNumber);
	}
}
