package com.prodemy.miniproject.service;

import java.util.List;

import com.prodemy.miniproject.dto.ProductDto;
import com.prodemy.miniproject.model.Product;

public interface ProductService {
	
//	void saveProduct(ProductDto productDto);
	Product findProductByName(String productName);
	List<ProductDto> findAllProducts();

}
