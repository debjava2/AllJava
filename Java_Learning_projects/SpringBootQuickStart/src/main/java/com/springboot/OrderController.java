package com.springboot;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Models.Customer;
import com.springboot.topic.cource.DTO.OrderRequest;
import com.springboot.topic.cource.Repository.CustomerRepository;
import com.springboot.topic.cource.Repository.DepartmentRepository;
import com.springboot.topic.cource.Repository.ProductRepository;

@RestController
public class OrderController {

	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	
	@PostMapping("/placeOrder")
	public Customer placeOrder(@RequestBody OrderRequest request) {
		return customerRepository.save(request.getCustomer());
	}
	
	@PostMapping("/placeOrder2")
	public Customer placeOrder2(@RequestBody Customer customer) {
		return customerRepository.save(customer);
	}
	
	@GetMapping("/AllOrders")
	public List<Customer> findAllOrder() {
		return customerRepository.findAll();
	}
	
	@GetMapping("/Orders")
	public List<Customer> Orders() {
		return customerRepository.getAllDetialsOfCustomerBasedonId();
	}
	
	@GetMapping("/getEmpDetails")
	public void getEmpDeptDetails() {
		System.out.println(departmentRepository.fetchEmpDeptDataRightJoin());
	}
	
	//fetchEmpDeptDataRightJoin
}
