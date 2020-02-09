package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.models.Order;
import com.example.demo.repository.OrderDao;

public class OrderService {
	@Autowired
	private OrderDao orderDao;
	
	public void add(Order order) {
		orderDao.saveOrder(order);
	}
}
