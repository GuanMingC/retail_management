//package com.retail.Order_Management.Order;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//import org.springframework.context.annotation.ComponentScan;
//
//@Entity
//@Table(name="producttable")
//public class Product {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name="ID", unique = true)
//	Integer product_id;
//	@Column(name="Product_Price")
//	Double product_price;
//	@Column(name="Product_Name")
//	String product_name;
//	
//	
//	@Column(name="Order_ID")
//	Integer order_id;
//	@ManyToOne
//	@JoinColumn(name="ID")
//    //@JoinColumn(name = "Order_ID", nullable = false,
//    //    referencedColumnName = "order_id")
//    Order order;
//	public Integer getProduct_id() {
//		return product_id;
//	}
//	public Double getProduct_price() {
//		return product_price;
//	}
//	public void setProduct_price(Double product_price) {
//		this.product_price = product_price;
//	}
//	public String getProduct_name() {
//		return product_name;
//	}
//	public void setProduct_name(String product_name) {
//		this.product_name = product_name;
//	}
//	public Integer getOrder_id() {
//		return order_id;
//	}
//	public void setOrder_id(Integer order_id) {
//		this.order_id = order_id;
//	}
//	@Override
//	public String toString() {
//		return "Product [product_id=" + product_id + ", product_price=" + product_price + ", product_name="
//				+ product_name + ", order_id=" + order_id + "]";
//	}
//	public Product(Integer product_id, Double product_price, String product_name, Integer order_id) {
//		super();
//		this.product_id = product_id;
//		this.product_price = product_price;
//		this.product_name = product_name;
//		this.order_id = order_id;
//	}
//	public Product() {
//		super();
//	}
//	/**
//	public Order getOrder() {
//		return order;
//	}
//	public void setOrder(Order order) {
//		this.order = order;
//	}
//	*/
//	
//}
