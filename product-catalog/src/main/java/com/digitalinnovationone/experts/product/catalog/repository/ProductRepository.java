package com.digitalinnovationone.experts.product.catalog.repository;

import com.digitalinnovationone.experts.product.catalog.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
