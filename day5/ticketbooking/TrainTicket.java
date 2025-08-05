package com.day5.ticketbooking;

public class TrainTicket extends Ticket {
	public static boolean[] seats=new boolean[300];
	public int coachNumber;
	public TrainTicket(String passengerName, String source, String destination, int coachNumber) {
		super(passengerName,source,destination);
//		if(seats[coachNumber]) System.out.printf("%d is already booked !",coachNumber);
//		else {
			this.coachNumber = coachNumber;
			TrainTicket.seats[coachNumber] = true;
//		}
	}
	
	@Override
	public void bookTicket() {
		System.out.println("Train Ticket Booked Successfullly!");
		System.out.println("Passenger Name : "+super.passengerName);
		System.out.println("Source : "+super.source);
		System.out.println("Destination : "+super.destination);
		System.out.println("Coach Number : "+this.coachNumber);
	}
}
