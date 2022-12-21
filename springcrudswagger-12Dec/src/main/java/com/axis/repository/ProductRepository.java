package com.axis.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axis.model.Product;


@Repository // optional
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	public List<Product> findByCategory(String category);
}
