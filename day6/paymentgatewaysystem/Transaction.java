package com.day6.paymentgatewaysystem;
import java.util.List;
import java.util.ArrayList;
public class Transaction extends Payment{
	public static List<List<String>> transactionHistory = new ArrayList<>();
	private String transactionId;
	private String transactionStatus="Success";
	
	public Transaction() {
        this.transactionId = "TXN" + (int)(Math.random() * 1000000);
    }
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getTransactionStatus() {
		return transactionStatus;
	}
	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}
	
	
	public void displayTransactionSummary() {
		super.displayPaymentDetails();
		System.out.println("Transaction Id : "+this.transactionId);
		System.out.println("Transaction Status : "+this.transactionStatus);
	}
}
