package com.codejava;

public class BillCollector {

		private IPayment iPayment;

		public void setiPayment(IPayment iPayment) {
			System.out.println("setiPayment :: executed");
			this.iPayment = iPayment;
		}

		public BillCollector(IPayment iPayment) {
			super();
			this.iPayment = iPayment;
		}

		public BillCollector() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public void collectPayment(double amount) {
			System.out.println("Injected :: "+iPayment.getClass().getName());
			String status = iPayment.pay(amount);
			System.out.println(status);
		}
}
