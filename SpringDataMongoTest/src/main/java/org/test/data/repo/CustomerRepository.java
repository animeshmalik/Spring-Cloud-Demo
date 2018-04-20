package org.test.data.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.test.data.entrity.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);

}
