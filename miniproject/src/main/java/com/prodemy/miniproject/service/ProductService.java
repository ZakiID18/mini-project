package com.prodemy.miniproject.service;

<<<<<<< HEAD
import java.util.List;

import com.prodemy.miniproject.dto.ProductDto;
import com.prodemy.miniproject.model.Product;

public interface ProductService {
	
//	void saveProduct(ProductDto productDto);
	Product findProductByName(String productName);
	List<ProductDto> findAllProducts();
=======
import com.prodemy.miniproject.dto.ProductDto;
import com.prodemy.miniproject.model.Product;
>>>>>>> branch 'master' of https://github.com/ZakiID18/mini-project.git

import java.util.List;

public interface ProductService {
    List<ProductDto> findAllProduct();
    Product findProductByName(String productName);
}
