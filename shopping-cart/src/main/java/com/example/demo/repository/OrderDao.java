package com.example.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.Order;

@Repository
public class OrderDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void saveOrder(Order order) {
		entityManager.persist(order);
	}
	
	public List<Order> getOrders(){
		Query q=entityManager.createQuery("select ordr from Order ordr");
		List <Order> list = q.getResultList();
		return list;
	}
	

}
