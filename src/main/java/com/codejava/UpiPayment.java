package com.codejava;

public class UpiPayment  implements IPayment{
	
	

	public UpiPayment() {
		System.out.println("UpiPayment::Constructor");
	}

	public String pay(double amount) {
		// TODO Auto-generated method stub
		return "Payment successfull through UPI Payment";
	}


}
