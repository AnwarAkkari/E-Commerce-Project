package com.tts.eCommerce.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tts.eCommerce.model.Cart;

public class OrderController {
	
	@GetMapping("/checkout")
	public String checkout (Cart cart, Model model) {
		Order purchaseOrder = orderService.makePurchaseOrder(cart);
		model.addAttribute("purchaseOrder", purchaseOrder);
		return "storefront/invoice;
	}

}
