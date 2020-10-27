package edu.escuelaing.ieti.mongolab.repository;

import edu.escuelaing.ieti.mongolab.entities.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {

}
