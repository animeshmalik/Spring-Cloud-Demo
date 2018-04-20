package org.test.data.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.test.data.entrity.Product;

public interface ProductRepository  extends MongoRepository<Product, String>{

}
