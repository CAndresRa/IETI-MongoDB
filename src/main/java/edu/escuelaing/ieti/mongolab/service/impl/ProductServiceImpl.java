package edu.escuelaing.ieti.mongolab.service.impl;

import edu.escuelaing.ieti.mongolab.entities.Product;
import edu.escuelaing.ieti.mongolab.repository.ProductRepository;
import edu.escuelaing.ieti.mongolab.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

    @Override
    public void create(Product product) {
        productRepository.save(product);
    }

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> findByResponsible(String id) {
        return productRepository.findByResponsible(id);
    }
}
