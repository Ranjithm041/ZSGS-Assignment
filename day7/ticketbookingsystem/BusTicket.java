package com.day7.ticketbookingsystem;

public class BusTicket implements Ticket {
	public static boolean[] seats=new boolean[64];
	private int seatNumber;
	private String passengerName;
	private String source;
	private String destination;
	
	public BusTicket(int seatNumber, String passengerName, String source, String destination) {
		this.seatNumber = seatNumber;
		this.passengerName = passengerName;
		this.source = source;
		this.destination = destination;
		BusTicket.seats[seatNumber]=true;
	}

	
	
	public int getSeatNumber() {
		return seatNumber;
	}



	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}



	public String getPassengerName() {
		return passengerName;
	}



	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}



	public String getSource() {
		return source;
	}



	public void setSource(String source) {
		this.source = source;
	}



	public String getDestination() {
		return destination;
	}



	public void setDestination(String destination) {
		this.destination = destination;
	}



	@Override
	public void bookTicket() {
		System.out.println("Bus Ticket Booked Successfullly!");
		System.out.println("Passenger Name : "+this.passengerName);
		System.out.println("Source : "+this.source);
		System.out.println("Destination : "+this.destination);
		System.out.println("Seat Number : "+this.seatNumber);
	}
}
