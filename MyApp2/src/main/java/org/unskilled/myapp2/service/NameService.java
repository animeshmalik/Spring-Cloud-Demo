package org.unskilled.myapp2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class NameService {
	@Autowired
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "defaultList")
	public List<String> getNames(){
		List names=this.restTemplate.getForObject("http://NameService/nameservice/names", List.class);
		return names;
	}
	
	public List<String> defaultList(){
		List names=new ArrayList<String>();
		names.add("default name");
		return names;
	}
}
