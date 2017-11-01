package org.unskilled.myapp2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.unskilled.myapp2.service.NameService;

@RestController
@RequestMapping(path="/myapp2")
public class MyAppController {
	
	@Value("${app.name}")
	private String name;
	
	@Autowired
	private NameService nameService;
	
	@RequestMapping(method=RequestMethod.GET, path="welcome")
	public Object welcome(){
		//return "this is  "+this.name;
		
		return this.nameService.getNames();
	}

}
