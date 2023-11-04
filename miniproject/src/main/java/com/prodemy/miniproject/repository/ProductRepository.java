package com.prodemy.miniproject.repository;

<<<<<<< HEAD
import java.util.List;
=======
import com.prodemy.miniproject.model.Product;
import com.prodemy.miniproject.service.ProductService;
import org.springframework.data.jpa.repository.JpaRepository;
>>>>>>> branch 'master' of https://github.com/ZakiID18/mini-project.git

<<<<<<< HEAD
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prodemy.miniproject.model.Product;
import com.prodemy.miniproject.model.User;

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
	
=======
public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByName (String name);
>>>>>>> branch 'master' of https://github.com/ZakiID18/mini-project.git
}
