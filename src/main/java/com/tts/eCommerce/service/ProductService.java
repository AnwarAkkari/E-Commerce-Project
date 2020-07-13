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
<<<<<<< HEAD
		List<Product> products = new ArrayList<Product>();
		if (brand == "") {
			products = productRepository.findDistinctCategories();
		}
		if (category == "") {
			products = productRepository.findDistinctBrands();
		}
		
		return products;
=======

		return null;
>>>>>>> c86bf15009bad7136a5a0857f7a149077308fe8b
	}

	public Product findProductById(long id) {
		Product product = productRepository.findbyId(id);
		return product;
	}

	public void save(Product product) {
		productRepository.save(product);
	}

	public void deleteById(long id) {
		productRepository.deleteById(id);
	}
}
