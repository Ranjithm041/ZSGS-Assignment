package com.day10.bankaccount;

public class Account {
	private int accountNumber;
	private String holderName ;
	private Double balance;
	public Account(int accountNumber, String holderName, Double balance) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public void applyInterest(Double interestRate) {
		double currentBalance = balance;
		double interest = currentBalance * interestRate /100;
		this.balance = currentBalance + interest;
	}
	@Override
	public String toString() {
		return "\nAccount Number : "+this.accountNumber+"\nHolder Name : "+this.holderName+"\nBalance : "+this.balance;
	}
}
