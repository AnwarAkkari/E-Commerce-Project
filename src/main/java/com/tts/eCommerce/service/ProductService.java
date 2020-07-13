package com.tts.eCommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tts.eCommerce.model.Product;
import com.tts.eCommerce.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public List<Product> findAll() {
		List<Product> products = productRepository.findAll();
		return products;
	}

	public List<Product> findCategories() {
		List<Product> products = productRepository.findDistinctCategories();
		return products;
	}

	public List<Product> findBrands() {
		List<Product> products = productRepository.findDistinctBrands();
		return products;
	}

	public List<Product> findByBrandAndOrCategory(String brand, String category) {
		List<Product> products = new ArrayList<Product>();
		if (brand == "") {
			products = productRepository.findDistinctCategories();
		}
		if (category == "") {
			products = productRepository.findDistinctBrands();
		}
		
		return products;
	}

	
	
}
