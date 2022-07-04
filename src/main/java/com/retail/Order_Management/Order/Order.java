package com.retail.Order_Management.Order;

import java.util.ArrayList;

import javax.persistence.*;

import org.springframework.context.annotation.ComponentScan;

@Entity
@ComponentScan
@Table(name="ordertable")
public class Order {
/**
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="ID", unique = true)
Integer order_id;
@Column(name="Order_Price")
Double order_price;
@Column(name="Order_List")
ArrayList<String> order_list;
public Integer getOrder_id() {
	return order_id;
}
public Double getOrder_price() {
	return order_price;
}
public void setOrder_price(Double order_price) {
	this.order_price = order_price;
}
public ArrayList<String> getOrder_list() {
	return order_list;
}
public void setOrder_list(ArrayList<String> order_list) {
	this.order_list = order_list;
}
@Override
public String toString() {
	return "Order [order_id=" + order_id + ", order_price=" + order_price + ", order_list=" + order_list + "]";
}
public Order(Integer order_id, Double order_price, ArrayList<String> order_list) {
	super();
	this.order_id = order_id;
	this.order_price = order_price;
	this.order_list = order_list;
}
public Order() {
	// TODO Auto-generated constructor stub
}
**/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID", unique = true)
	Integer order_id;
	@Column(name="Order_Price")
	Double order_price;
	@Column(name="Order_List")
	ArrayList<String> order_list;
	@Column(name="Name")
	String name;
	@Column(name="Email_ID")
	String email;
	public Integer getOrder_id() {
		return order_id;
	}
	@Override
	public String toString() {
		return "Order1 [order_id=" + order_id + ", order_price=" + order_price
				+ ", order_list=" + order_list + ", name=" + name + ", email="
				+ email + "]";
	}
	public Order() {
	}
	public Order(Integer order_id, Double order_price,
			ArrayList<String> order_list, String name, String email) {
		super();
		this.order_id = order_id;
		this.order_price = order_price;
		this.order_list = order_list;
		this.name = name;
		this.email = email;
	}
	public Double getOrder_price() {
		return order_price;
	}
	public void setOrder_price(Double order_price) {
		this.order_price = order_price;
	}
	public ArrayList<String> getOrder_list() {
		return order_list;
	}
	public void setOrder_list(ArrayList<String> order_list) {
		this.order_list = order_list;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
