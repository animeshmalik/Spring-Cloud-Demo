package org.test.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {
	
	@Autowired
	org.test.data.repo.StudentRepository studentRepository;

	@RequestMapping(method = RequestMethod.GET, path = "students")
	public Object welcome() {
		// return "this is "+this.name;

		return this.studentRepository.findAll();
	}
}
