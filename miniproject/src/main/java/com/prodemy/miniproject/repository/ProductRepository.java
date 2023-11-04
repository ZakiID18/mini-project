package com.prodemy.miniproject.repository;

import com.prodemy.miniproject.model.Product;
import com.prodemy.miniproject.service.ProductService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByName (String name);
}
