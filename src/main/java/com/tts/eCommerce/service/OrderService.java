package com.tts.eCommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tts.eCommerce.model.Cart;
import com.tts.eCommerce.model.Order;
import com.tts.eCommerce.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;

	
	
	public Order makePurchaseOrder(Cart cart) {
		//Order thatObjectThatBecomesAnOrderFromACart.(whateverthefield) = new Order();
		// code to populate fields to create an order object
		//return thatObjectThatBecomesAnOrderFromACart;
		return null;
	}
	
	//method to calculate shipping and tax and calculate a total
	private Double calcSalesTax(Double subTotal) {
		//math for tax	
		Double salesTax = 0.1 * subTotal;
		return salesTax;
	}



}
