package com.restService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class ServiceController {

	@RequestMapping(path = "/name" , method = RequestMethod.GET, produces = "application/json")	
	public String name(){
		return "wellsfargo";
	}
}
