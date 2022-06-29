package com.retail.Service;

import java.util.List;
import java.util.Optional;

import com.retail.Data.Order;

public interface OrderService {
	List<Order> saveOrder(Order order);
	List<Order> getAllOrders();
	Optional<Order> getOrderById(Integer id);
	Order updateOrder(Order order, Integer id);
	List<Order> deleteOrder(Integer id);
}
