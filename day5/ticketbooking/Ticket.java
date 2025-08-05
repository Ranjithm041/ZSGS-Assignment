package com.day5.ticketbooking;

public abstract class Ticket {
	protected String passengerName;
	protected String source;
	protected String destination;
	protected Ticket(String passengerName, String source, String destination) {
		this.passengerName = passengerName;
		this.source = source;
		this.destination = destination;
	}
	protected abstract void bookTicket();
}
