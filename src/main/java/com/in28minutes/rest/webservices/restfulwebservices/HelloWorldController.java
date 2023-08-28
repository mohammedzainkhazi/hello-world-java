package com.in28minutes.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping(path = "/zain")
	public String helloWorld() {
		return "{\"message\":\"Hello World ZAIN! \"}";
	}
}
