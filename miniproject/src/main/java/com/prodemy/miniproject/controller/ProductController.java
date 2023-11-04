package com.prodemy.miniproject.controller;

import com.prodemy.miniproject.dto.ProductDto;
import com.prodemy.miniproject.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

//    @GetMapping("/products")
//    public String listProduct(Model model){
//        List<ProductDto> product = productService.findAllProducts();
//        model.addAttribute("products", product);
//        return "products";
//    }
}
