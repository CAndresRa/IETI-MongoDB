package edu.escuelaing.ieti.mongolab.controllers;

import edu.escuelaing.ieti.mongolab.entities.Customer;
import edu.escuelaing.ieti.mongolab.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/ncustomer")
    public ResponseEntity<?> addCustomer(@RequestBody Customer customer){
        customerService.create(customer);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/customers")
    public ResponseEntity<?> customers(){
        List<Customer> customers = customerService.customers();
        return new ResponseEntity<>(customers, HttpStatus.NOT_FOUND);
    }

}
