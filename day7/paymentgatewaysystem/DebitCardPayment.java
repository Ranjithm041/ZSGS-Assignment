package com.day7.paymentgatewaysystem;

public class DebitCardPayment  implements PaymentMethod{
	public void pay(double amount) {
		System.out.println("Amount Rs."+amount+" paid through "+this.getClass().getSimpleName());
	}
}
