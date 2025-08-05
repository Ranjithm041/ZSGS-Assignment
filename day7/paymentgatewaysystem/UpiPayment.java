package com.day7.paymentgatewaysystem;

public class UpiPayment implements PaymentMethod{
	public void pay(double amount) {
		System.out.println("Amount Rs."+amount+" paid through "+this.getClass().getSimpleName());
	}
}
