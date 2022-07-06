//package com.retail.Order_Management.OrderService;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.retail.Order_Management.Order.Product;
//import com.retail.Order_Management.OrderRepo.ProductRepository;
//@Service
//public class ProductServiceImpl implements ProductService{
//
//		@Autowired
//		ProductRepository repo;
//		@Autowired
//		public ProductServiceImpl(ProductRepository repo) {
//			super();
//			this.repo = repo;
//		}
//
//		@Override
//		public List<Product> saveProduct(Product product) {
//			// TODO Auto-generated method stub
//			repo.save(product);
//			return repo.findAll();
//		}
//
//		@Override
//		public List<Product> getAllProducts() {
//			// TODO Auto-generated method stub
//			return repo.findAll();
//		}
//
//		@Override
//		public Optional<Product> getProductById(Integer id) {
//			// TODO Auto-generated method stub
//			return repo.findById(id);
//		}
//
//		@Override
//		public Optional<Product> getProductByName(String name) {
//			// TODO Auto-generated method stub
//			return repo.findByName(name);
//		}
//}
