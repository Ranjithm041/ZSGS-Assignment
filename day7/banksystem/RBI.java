	package com.day7.banksystem;
	
	public abstract class RBI {	
		Customer c;
		Account a;
		public RBI(Customer customer, Account account) {
			c=customer;
			a=account;
		}
		abstract double getInterestRate() ;
		abstract double getWithdrawalLimit() ;
	}
	