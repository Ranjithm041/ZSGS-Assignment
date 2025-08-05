package com.day6.travelbookingsystem.booking;

public class Ticket {
	private int id = (int ) Math.random()*100000;
	private String source;
	private int destinationKey;
	public static String[] destinations = {
		    "Taj Mahal - Agra",
		    "India Gate - Delhi",
		    "Gateway of India - Mumbai",
		    "Zoho - Chennai",
		    "Red Fort - Delhi",
		    "Wonderla - Kochi",
		    "Mysore Palace - Mysore",
		    "Meenakshi Temple - Madurai",
		    "Golden Temple - Amritsar",
		    "QueensLand - Chennai"
		};

	public static double[] fares = {
		    1200.0, 900.0, 1100.0, 1000.0, 950.0,
		    925.0, 1150.0, 980.0, 1300.0, 1050.0
	};

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public double getFares(int index) {
		return fares[index];
	}


	public int getId() {
		return id;
	}

	public int getDestination() {
		return destinationKey;
	}

	public void setDestination( int destinationKey) {
		this.destinationKey = destinationKey;
	}

}
