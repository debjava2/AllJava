package com.springboot.topic.cource.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.Models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
