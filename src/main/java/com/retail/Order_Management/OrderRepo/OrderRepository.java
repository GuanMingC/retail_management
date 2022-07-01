package com.retail.Order_Management.OrderRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.retail.Order_Management.Order.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order,Integer>{

}
