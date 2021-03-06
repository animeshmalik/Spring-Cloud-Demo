package org.test.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.test.data.entrity.Customer;
import org.test.data.entrity.Product;
import org.test.data.repo.CustomerRepository;
import org.test.data.repo.ProductRepository;

@SpringBootApplication
public class SpringDataMongoTestApplication implements CommandLineRunner  {

	@Autowired
	private CustomerRepository repository;
	
	@Autowired
	private ProductRepository productRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataMongoTestApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();

		// save a couple of customers
		repository.save(new Customer("Alice", "Smith"));
		repository.save(new Customer("Bob", "Smith"));

		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Customer customer : repository.findAll()) {
			System.out.println(customer);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("Customer found with findByFirstName('Alice'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByFirstName("Alice"));

		System.out.println("Customers found with findByLastName('Smith'):");
		System.out.println("--------------------------------");
		for (Customer customer : repository.findByLastName("Smith")) {
			System.out.println(customer);
		}
		
		
		productRepository.deleteAll();
		System.out.println("===========================product entry===========================");
		
		productRepository.save(new Product("iPhone", "1000.00", 11.50));
		productRepository.save(new Product("laptop", "1500.00", 15.50));
		
		System.out.println("===========================product List===========================");
		
		productRepository.findAll().forEach(System.out::println);
	}
}
