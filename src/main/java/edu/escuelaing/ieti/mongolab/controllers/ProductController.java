package edu.escuelaing.ieti.mongolab.controllers;

import edu.escuelaing.ieti.mongolab.entities.Product;
import edu.escuelaing.ieti.mongolab.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/nproduct")
    public ResponseEntity<?> addCustomer(@RequestBody Product product){
        productService.create(product);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/products")
    public ResponseEntity<?> products(){
        List<Product> products = productService.getProducts();
        return new ResponseEntity<>(products, HttpStatus.NOT_FOUND);
    }

    @GetMapping("/responsible")
    public ResponseEntity<?> productsByResponsible(@RequestParam(value = "id") String id){
        List<Product> products = productService.findByResponsible(id);
        return new ResponseEntity<>(products, HttpStatus.NOT_FOUND);
    }



}
