package com.day6.paymentgatewaysystem;

public class Payment {
	//payer name, payee name, amount, payment method,
	private String payerName;
	private String payeeName;
	private double amount;
	private PaymentMethod paymentMethod;
	public void displayPaymentDetails() {
		System.out.println("Payer Name : "+this.payerName);
		System.out.println("Payee Name : "+this.payeeName);
		System.out.println("Amount : Rs."+this.amount);
		System.out.println("Payment Method : "+this.paymentMethod);
	}
	public String getPayerName() {
		return payerName;
	}
	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}
	public String getPayeeName() {
		return payeeName;
	}
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	
}

enum PaymentMethod{
	UPI,
	DEBITCARD,
	CREDITCARD,
	BANK
}