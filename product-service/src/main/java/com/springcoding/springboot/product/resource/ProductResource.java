package com.springcoding.springboot.product.resource;

import com.springcoding.springboot.product.config.ProductConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductResource {
    @Autowired
    ProductConfiguration productConfiguration;

    @GetMapping("/message")
    public String message(){
        return productConfiguration.getMessage();
    }

}
