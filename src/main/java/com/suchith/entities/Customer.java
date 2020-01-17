package com.suchith.entities;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_table")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer customerId;
	
	@Column(name = "customer_name")
	private String name;
	
	@Column(name = "customer_password")
	private String password;

	public Customer() {
		
	}
	
	public Customer(String name, String password) {
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", password=" + password + "]";
	}
	
	
}
