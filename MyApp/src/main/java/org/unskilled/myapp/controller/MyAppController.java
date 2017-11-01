package org.unskilled.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.unskilled.myapp.NameService;

@RestController
@RequestMapping(path="/myapp")
public class MyAppController {
	@Value("${test.testProp.Name}")
	private String name;
	@Autowired
	private NameService nameService;
	@RequestMapping(method=RequestMethod.GET, path="welcome")
	public Object welcome(){
		return this.nameService.getNames();
	}
}
