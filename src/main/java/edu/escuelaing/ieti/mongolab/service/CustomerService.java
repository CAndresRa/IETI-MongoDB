package edu.escuelaing.ieti.mongolab.service;

import edu.escuelaing.ieti.mongolab.entities.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> customers();

    void create(Customer customer);
}
