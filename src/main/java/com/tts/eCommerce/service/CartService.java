package com.tts.eCommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tts.eCommerce.repository.UserRepository;

@Service
public class CartService {

	@Autowired
	private UserRepository userRepository;
	
}
