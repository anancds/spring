package com.cds.learn;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by cds on 3/5/17 18:04.
 */
public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);

}
