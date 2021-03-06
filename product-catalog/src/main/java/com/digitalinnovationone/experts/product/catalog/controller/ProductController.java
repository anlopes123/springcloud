package com.digitalinnovationone.experts.product.catalog.controller;


import com.digitalinnovationone.experts.product.catalog.model.Product;
import com.digitalinnovationone.experts.product.catalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.POST)
    public Product create(@RequestBody Product product) {
       return productRepository.save(product);
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    Optional<Product> findById(@PathVariable Integer id){
      return productRepository.findById(id);
    }
}
