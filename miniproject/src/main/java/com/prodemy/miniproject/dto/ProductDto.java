package com.prodemy.miniproject.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto 
{
	
    private Long id;
    @NotEmpty(message = "Product Name Should Not Be Empty")
    private String productName;
    @NotEmpty(message = "Product Description Should Not Be Empty")
    private String productDescription;
    @NotEmpty(message = "Product Price Should Not Be Empty")
    private Long productPrice;
    @NotEmpty(message = "Product Image Should Not Be Empty")
    private byte[] productImage;

}
