package com.sofy.abcinc.ABCInc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="ORDER")
public class Order {
	
	@Column(name = "ORDER_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int orderdate;
	private String product;
	@ManyToMany(targetEntity= Order.class)
	private int cust_id;
	
	
	public Order() {
		super();
	}


	public Order(int id, int orderdate, String product, int cust_id) {
		super();
		this.id = id;
		this.orderdate = orderdate;
		this.product = product;
		this.cust_id = cust_id;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getOrderdate() {
		return orderdate;
	}


	public void setOrderdate(int orderdate) {
		this.orderdate = orderdate;
	}


	public String getProduct() {
		return product;
	}


	public void setProduct(String product) {
		this.product = product;
	}


	public int getCust_id() {
		return cust_id;
	}


	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	
	
	
	
	

}
