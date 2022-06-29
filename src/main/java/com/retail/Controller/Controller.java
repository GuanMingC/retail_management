package com.retail.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.retail.Data.Order;
import com.retail.Repo.OrderRepository;
import com.retail.Service.OrderService;

@RestController
@ComponentScan
//@RequestMapping("/api/order")
public class Controller {

	@Autowired
	OrderRepository repo;
	//Order order;

	OrderService orderservice;
	@Autowired
	public Controller(OrderService orderservice) {
		super();
		this.orderservice = orderservice;
	}

	@GetMapping("/getorders")
	public List<Order> getOrders(){
		return repo.findAll();
	}
	
	@GetMapping("/getorders/{id}")
	public boolean getOrderById(@PathVariable(value = "id") Integer id){
		if(repo.existsById(id)) {
			System.out.println(repo.findById(id));
			return true;
		}
		else {
			return false;
		}
	}
	
	@PostMapping(path="/postorders",consumes={"application/json"})
	public List<Order> saveOrder(@RequestBody Order new_order){
		repo.save(new_order);
		return repo.findAll();
	}
	
	@PutMapping(path="/updateorders",consumes= {"application/json"})
	public Optional<Order> updateOrders(@RequestBody Order new_order){
		if (getOrderById(new_order.getOrder_id())==true){
			repo.save(new_order);
		}
		else {
			System.out.println("Invalid Record/ID");
		}
		return repo.findById(new_order.getOrder_id());
	}
	
	@DeleteMapping("/deleteorders")
	public List<Order> deleteOrders(Integer id)
	{
		repo.deleteById(id);
		return repo.findAll();
		
	}
}
