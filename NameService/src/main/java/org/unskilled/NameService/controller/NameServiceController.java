package org.unskilled.NameService.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/nameservice")
public class NameServiceController {

	@RequestMapping(method=RequestMethod.GET, path="names")
	public Object getNameList(){
		List<String> nameList=new ArrayList<String>();
		nameList.add("Animesh");
		nameList.add("Pandey");
		nameList.add("Vijay");
		nameList.add("Pushpesh");
		return nameList;
	}
	
}
