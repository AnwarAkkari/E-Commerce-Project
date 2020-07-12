package com.tts.eCommerce.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.eCommerce.model.Product;
import com.tts.eCommerce.model.User;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{

	List<Product> findAll();
	public List<Product> findbyId(Long id);
	public List<Product> findbyName(String name);
	public List<Product> findbyBrand(String brand);
	public List<Product> findbyCategory(String category);
	public List<Product> findbyBrandAndCategory(String brand, String category);

	//@Query
}
