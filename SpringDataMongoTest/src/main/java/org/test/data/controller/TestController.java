package org.test.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.test.data.repo.CustomerRepository;
import org.test.data.repo.ProductRepository;

@RestController
public class TestController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private CustomerRepository customerRepository;

	@RequestMapping(method = RequestMethod.GET, path = "products")
	public Object products() {
		
		
		return productRepository.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "customers")
	public Object customers() {
		// return "this is "+this.name;

		return this.customerRepository.findAll();
	}
	
}
