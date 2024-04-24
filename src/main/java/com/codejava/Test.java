package com.codejava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-beans.xml");
		
		BillCollector collector =  context.getBean("billCollector", BillCollector.class);
		collector.collectPayment(1300.00);
	}
}
