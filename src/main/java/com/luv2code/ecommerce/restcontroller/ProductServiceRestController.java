package com.luv2code.ecommerce.restcontroller;

import com.luv2code.ecommerce.entity.Product;
import com.luv2code.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductServiceRestController {

    @Autowired private ProductService productService;

    @PostMapping(
            value = "/createProduct", consumes = "application/json", produces = "application/json")
    public String createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @GetMapping("")
    public String getHealth(){
        return "App is up and running!!";
    }
}
