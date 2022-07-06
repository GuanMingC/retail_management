//package com.retail.Order_Management.OrderController;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.retail.Order_Management.Order.Product;
//import com.retail.Order_Management.OrderRepo.ProductRepository;
//import com.retail.Order_Management.OrderService.ProductService;
//
//@RestController
//@CrossOrigin(origins = "http://127.0.0.1:5500", maxAge = 3600, exposedHeaders = "Access-Control-Allow-Origin")
//@RequestMapping("/api/product")
//public class ProductController {
//	@Autowired
//	ProductRepository repo;
//	ProductService productservice;
//	//private ProductService productservice;
//	
//	@Autowired
//	
//	public ProductController(ProductService productservice) {
//		super();
//		this.productservice = productservice;
//	}
//	
//	
//
//	Logger logger
//    = LoggerFactory.getLogger(ProductController.class);
//
//@GetMapping("/log") public void log()
//{
//    // Logging various log level messages
//}
//	
//	@GetMapping("/getproducts")
//	public List<Product> getProducts(){
//		//logger.info("INFO: List all orders");
//		logger.info("INFO: List all product");
//		return repo.findAll();
//	}
//	
//	@GetMapping("/getproduct/{id}")
//	public boolean getProductById(@PathVariable(value = "id") Integer id){
//		if(repo.existsById(id)) {
//			System.out.println(repo.findById(id));
//			logger.info("INFO: Product exists");
//			return true;
//		}
//		else {
//			logger.info("INFO: Product not available");
//			return false;
//		}
//	}
//	
//	@GetMapping("/getproductdetail/{id}")
//	public Optional<Product> getProductDetailById(@PathVariable(value = "id") Integer id){
//		logger.info("INFO: List product by id");
//		return repo.findById(id);
//	}
//	/**
//	@GetMapping("/getorderdetail/{name}")
//	public Optional<Order> getOrderDetailByName(@PathVariable(value = "name") Integer id){
//		return repo.findBy(null, null)	}
//	*/
//	//@GetMapping("/getproductdetail/{name}")
//	@RequestMapping(path="/getproductdetail?product_name=",method = RequestMethod.GET)
//	public Optional<Product> getOroductDetailByName(@RequestParam(value="name") String name) {
//		logger.info("INFO: List product by name");
//		return repo.findByName(name);
//	}
//	
//	@PostMapping(path="/postproduct",consumes={"application/json"})
//	public List<Product> saveProduct(@RequestBody Product new_product){
//		repo.save(new_product);
//		logger.info("INFO: Create new product");
//		return repo.findAll();
//	}
//}
