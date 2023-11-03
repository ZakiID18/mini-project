package com.prodemy.miniproject.service;

import com.prodemy.miniproject.dto.ProductDto;
import com.prodemy.miniproject.model.Product;

import java.util.List;

public interface ProductService {
    List<ProductDto> findAllProduct();
    Product findProductByName(String productName);
}
