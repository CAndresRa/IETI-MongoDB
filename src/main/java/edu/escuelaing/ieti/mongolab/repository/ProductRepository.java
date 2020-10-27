package edu.escuelaing.ieti.mongolab.repository;

import edu.escuelaing.ieti.mongolab.entities.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends MongoRepository<Product, Long> {

    List<Product> findByResponsible(String responsible);

}
