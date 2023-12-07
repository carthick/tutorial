package com.luv2code.ecommerce.service;

import com.luv2code.ecommerce.entity.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    public String createProduct(Product product){
        return product.toString();
    }
}
