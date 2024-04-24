package com.codejava;

public class CreditCardPayment implements IPayment{
	
	

	public CreditCardPayment() {
		System.out.println("Creditcard :: Constructor");
	}

	public String pay(double amount) {
		// TODO Auto-generated method stub
		return "Payment successfull through CreditCard";
	}

}
