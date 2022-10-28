package com.springboot.topic.cource.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.Models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	@Query("select c from customer c join c.product p")
	public List<Customer> getAllDetialsOfCustomerBasedonId();
}
