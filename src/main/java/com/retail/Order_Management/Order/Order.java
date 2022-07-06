package com.retail.Order_Management.Order;

import java.util.ArrayList;
import java.util.List;

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
	@Column(name="Order_Product")
	String order_product;
	//@Column(name="Order_Price")
	//List<Double> order_price;
	//@Column(name="Order_Product")
	//List<String> order_product;
	
	/**
	@OneToMany(mappedBy = "order")
	List<Product> product;
	*/
	@Column(name="Name")
	String name;
	@Column(name="Email_ID")
	String email;
	public Integer getOrder_id() {
		return order_id;
	}
	
	public Order() {
		super();
	}
	
public Order(Integer order_id, Double order_price, String order_product, String name, String email) {
		super();
		this.order_id = order_id;
		this.order_price = order_price;
		this.order_product = order_product;
		this.name = name;
		this.email = email;
	}

/**
	public Order(List<Double> order_price, List<String> order_product, String name, String email) {
		super();
		this.order_price = order_price;
		this.order_product = order_product;
		this.name = name;
		this.email = email;
	}
*/
	/**
	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", name=" + name + ", email=" + email + "]";
	}
	*/
/**
	public List<Double> getOrder_price() {
		return order_price;
	}
	public void setOrder_price(List<Double> order_price) {
		this.order_price = order_price;
	}
	public List<String> getOrder_product() {
		return order_product;
	}
	public void setOrder_product(List<String> order_product) {
		this.order_product = order_product;
	}
*/
	public String getName() {
		return name;
	}
	/**
	public Order(Integer order_id, String name, String email) {
	super();
	this.order_id = order_id;
	//this.order_price = order_price;
	//this.order_product = order_product;
	this.name = name;
	this.email = email;
}
*/
/**
	public Double getOrder_price() {
	return order_price;
}

public void setOrder_price(Double order_price) {
	this.order_price = order_price;
}

public String getOrder_product() {
	return order_product;
}

public void setOrder_product(String order_product) {
	this.order_product = order_product;
}
*/
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Double getOrder_price() {
		return order_price;
	}

	public void setOrder_price(Double order_price) {
		this.order_price = order_price;
	}

	public String getOrder_product() {
		return order_product;
	}

	public void setOrder_product(String order_product) {
		this.order_product = order_product;
	}

}
