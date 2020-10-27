package edu.escuelaing.ieti.mongolab.service.impl;

import edu.escuelaing.ieti.mongolab.entities.Customer;
import edu.escuelaing.ieti.mongolab.repository.CustomerRepository;
import edu.escuelaing.ieti.mongolab.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<Customer> customers() {
        return customerRepository.findAll();
    }

    @Override
    public void create(Customer customer) {
        customerRepository.save(customer);
    }
}
