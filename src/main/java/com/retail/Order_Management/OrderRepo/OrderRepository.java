package com.retail.Order_Management.OrderRepo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.retail.Order_Management.Order.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order,Integer>{
	Optional<Order> findByName(String name);

}
