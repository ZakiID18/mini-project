package com.prodemy.miniproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prodemy.miniproject.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	// WHERE name=?
	Product findByName(String name);
	
	// WHERE name LIKE '%name%'
//	List<Product> findByNameLike(String name);
//		
//	// WHERE name LIKE 'name%'
//	List<Product> findByNameStartsWith(String name);
//		
//	// WHERE name LIKE '%name'
//	List<Product> findByEndsWith(String name);
//	
//	// WHERE price=?
//	Product findByPrice(int price);

}
