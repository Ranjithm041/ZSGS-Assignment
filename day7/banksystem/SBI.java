package com.day7.banksystem;

public class SBI extends RBI{
	
	public SBI(Customer customer , Account account) {
		super(customer,account);
	}
	public double getInterestRate() {
		if(super.a.getType()==AccountType.SAVING) {
			return 4.0;
		}
		return 4.5;
	}
	public double getWithdrawalLimit() {
		if(super.a.getType()==AccountType.SAVING) {
			return 50000.0;
		}
		return 40000.0;
	}
}
