package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue
	@Column(name="product_id")
	private Integer productId;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="product_price")
	private Double productPrice;
	
	@Column(name="product_quantity")
	private Integer productQuantity;
	
	public Integer getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	public Product(String productName, Integer productId, Double productPrice) {
		super();
		this.productName = productName;
		this.productId = productId;
		this.productPrice = productPrice;
	}
	
	

}
