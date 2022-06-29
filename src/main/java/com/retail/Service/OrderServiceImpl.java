package com.retail.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.Data.Order;
import com.retail.Repo.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	OrderRepository repo;
	@Autowired
	public OrderServiceImpl(OrderRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public List<Order> saveOrder(Order order) {
		// TODO Auto-generated method stub
		repo.save(order);
		return repo.findAll();
	}

	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Optional<Order> getOrderById(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public Order updateOrder(Order order, Integer id) {
		// TODO Auto-generated method stub
		if(getOrderById(id).isPresent()==true) {
			repo.save(order);
		}
		return order;
	}

	@Override
	public List<Order> deleteOrder(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		return repo.findAll();
	}

}
