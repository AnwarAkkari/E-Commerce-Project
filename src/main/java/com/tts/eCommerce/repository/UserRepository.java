package com.tts.eCommerce.repository;

import com.tts.eCommerce.model.User;

public interface UserRepository {
	
	public User findByUsername(String username);
}
