package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Product;
import com.example.demo.repository.ProductDao;

@Service
public class ProductService {
	
	@Autowired
	private ProductDao productDao;
	
	public void add(Product product) {
		productDao.saveProduct(product);
	}
}
