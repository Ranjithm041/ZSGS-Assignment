/*
 * 
 * 
5. Design a class named`BankAccount that uses the concept of encapsulation. 
The class should have the following private data members: account number, account holder name, and balance.
 Provide public getter and setter methods to access and modify these fields. Also, include a method to deposit and
  withdraw amount ensuring that the balance cannot go negative.
 * 
 * 
 */

package com.day6.bankaccount;

public class BankAccount {
	private long accountNumber;
	private String name;
	private double balance=0;
	public BankAccount(long accountNumber, String name, double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit(double balance) {
		this.balance+=balance;
	}
	public void withdraw(double balance) {
		if(this.balance>balance && balance>100)
		 this.balance-=balance;
		else System.out.println("There is no enough money or invalid amount !");
	}
	public double viewBalance() {
		return this.balance;
	}
	@Override
	public String toString() {
		return "Account Holder Name : "+this.name+"\nAccount Number      : "+this.accountNumber+"\nBalance             : "+this.balance;
	}
}
