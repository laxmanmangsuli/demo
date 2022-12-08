package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {
	@GetMapping("/greet")
	public String greetApi() {
		String msg="Good Afternoon";
		return msg;
	}

}
