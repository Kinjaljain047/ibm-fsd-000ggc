package com.example.demo.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ManyToAny;

public class Product {

	private Integer id;
	private String productName;
	private String productType;
	private int cost;
	private int quantity;
	
	@OneToOne(mappedBy = "product",cascade = CascadeType.ALL)
	private Shopping shopping;
	
	@ManyToMany
	@JoinColumn(name="customer1_id" )
	private Set<Customer> customer1 = new HashSet<>();

	public Product() {
		super();
	}

	public Product(String productName, String productType, int cost, int quantity, Shopping shopping,
			Set<Customer> customer1) {
		super();
		this.productName = productName;
		this.productType = productType;
		this.cost = cost;
		this.quantity = quantity;
		this.shopping = shopping;
		this.customer1 = customer1;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Shopping getShopping() {
		return shopping;
	}

	public void setShopping(Shopping shopping) {
		this.shopping = shopping;
	}

	public Set<Customer> getCustomer1() {
		return customer1;
	}

	public void setCustomer1(Set<Customer> customer1) {
		this.customer1 = customer1;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", productType=" + productType + ", cost=" + cost
				+ ", quantity=" + quantity + ", shopping=" + shopping + ", customer1=" + customer1 + "]";
	}
	
	
	
}
