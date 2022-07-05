package com.retail.Order_Management.OrderService;

import java.util.List;
import java.util.Optional;

import com.retail.Order_Management.Order.Order;

public interface OrderService {
	List<Order> saveOrder(Order order);
	List<Order> getAllOrders();
	Optional<Order> getOrderById(Integer id);
	Order updateOrder(Order order, Integer id);
	List<Order> deleteOrder(Integer id);
	Optional<Order> getOrderByName(String name);
}
