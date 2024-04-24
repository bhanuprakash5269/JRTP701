package com.codejava;

public class DebitCardPayment implements IPayment{
	
	

	public DebitCardPayment() {
		System.out.println("DebitCardPayment::Constructor");
	}

	public String pay(double amount) {
		// TODO Auto-generated method stub
		return "Payment successfull through DebitCard";
	}


}
