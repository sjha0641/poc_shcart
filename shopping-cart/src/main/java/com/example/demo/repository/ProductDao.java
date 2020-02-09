package com.example.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.Product;

public class ProductDao {
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void saveProduct(Product product) {
		entityManager.persist(product);
	}
	
	public List<Product> getProduct(){
		Query q=entityManager.createQuery("select prod from Product prod");
		List <Product> list = q.getResultList();
		return list;
	}
}
