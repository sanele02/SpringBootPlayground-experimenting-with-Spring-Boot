package com.example.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		ApplicationContext context=  SpringApplication.run(StoreApplication.class, args);
		var oderService = context.getBean(OrderService.class);
		//var oderService = new  OrderService(new PayPalPaymentService());
		//oderService.setPaymentService(new PayPalPaymentService());
		oderService.placeOrder();
	}

}
