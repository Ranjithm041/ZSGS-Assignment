package com.day7.ticketbookingsystem;

public class TrainTicket implements Ticket {
	public static boolean[] seats=new boolean[300];
	private int coachNumber;
	private String passengerName;
	private String source;
	private String destination;
	
	public TrainTicket(int coachNumber, String passengerName, String source, String destination) {
		this.coachNumber = coachNumber;
		this.passengerName = passengerName;
		this.source = source;
		this.destination = destination;
		TrainTicket.seats[coachNumber] = true;
	}

	public int getCoachNumber() {
		return coachNumber;
	}

	public void setCoachNumber(int coachNumber) {
		this.coachNumber = coachNumber;
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
		System.out.println("Train Ticket Booked Successfullly!");
		System.out.println("Passenger Name : "+this.passengerName);
		System.out.println("Source : "+this.source);
		System.out.println("Destination : "+this.destination);
		System.out.println("Coach Number : "+this.coachNumber);
	}
}
