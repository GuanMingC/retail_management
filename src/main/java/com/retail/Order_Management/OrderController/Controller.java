package com.retail.Order_Management.OrderController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.retail.Order_Management.Order.Order;
import com.retail.Order_Management.OrderRepo.OrderRepository;
import com.retail.Order_Management.OrderService.OrderService;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500", maxAge = 3600, exposedHeaders = "Access-Control-Allow-Origin")
@ComponentScan
@RequestMapping("/api/order")
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
	
	@GetMapping("/getorder/{id}")
	public boolean getOrderById(@PathVariable(value = "id") Integer id){
		if(repo.existsById(id)) {
			System.out.println(repo.findById(id));
			return true;
		}
		else {
			return false;
		}
	}
	
	@GetMapping("/getorderdetail/{id}")
	public Optional<Order> getOrderDetailById(@PathVariable(value = "id") Integer id){
		return repo.findById(id);
	}
	
	@PostMapping(path="/postorder",consumes={"application/json"})
	public List<Order> saveOrder(@RequestBody Order new_order){
		repo.save(new_order);
		return repo.findAll();
	}
	
	@PutMapping(path="/updateorder",consumes= {"application/json"})
	public Optional<Order> updateOrders(@RequestBody Order new_order){
		if (getOrderById(new_order.getOrder_id())==true){
			repo.save(new_order);
		}
		else {
			System.out.println("Invalid Record/ID");
		}
		return repo.findById(new_order.getOrder_id());
	}
	
	@DeleteMapping("/deleteorder/{id}")
	public List<Order> deleteOrders(@PathVariable(value="id") Integer id){
		repo.deleteById(id);
		return repo.findAll();
		
	}
}
