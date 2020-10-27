package edu.escuelaing.ieti.mongolab.service;

import edu.escuelaing.ieti.mongolab.entities.Product;

import java.util.List;

public interface ProductService {
    void create(Product product);

    List<Product> getProducts();

    List<Product> findByResponsible(String id);
}
