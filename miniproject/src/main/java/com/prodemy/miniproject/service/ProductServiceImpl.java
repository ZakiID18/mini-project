package com.prodemy.miniproject.service;

import com.prodemy.miniproject.dto.ProductDto;
import com.prodemy.miniproject.model.Product;
import com.prodemy.miniproject.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductDto> findAllProduct() {
        List<Product> products = productRepository.findAll();
        return products.stream()
                .map((product) -> mapToProductDto(product))
                        .collect(Collectors.toList());
    }

    private ProductDto mapToProductDto(Product product){
        ProductDto productDto = new ProductDto();
        productDto.setProductName(product.getName());
        productDto.setProductDescription(product.getDescription());
        productDto.setProductPrice(product.getPrice());
        productDto.setProductImage(product.getImage());
        return productDto;
    }

    @Override
    public Product findProductByName(String productName) {
        return productRepository.findByName(productName);
    }
}
