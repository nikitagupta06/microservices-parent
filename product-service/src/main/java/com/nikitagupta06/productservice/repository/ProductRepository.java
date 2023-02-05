package com.nikitagupta06.productservice.repository;

import com.nikitagupta06.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
