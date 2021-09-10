package com.jayesh.productservice.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jayesh.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String>{

}
