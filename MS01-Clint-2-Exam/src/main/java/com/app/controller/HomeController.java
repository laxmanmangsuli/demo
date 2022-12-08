package com.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
	public String prelogin()
	{
		System.out.println("This is Clint 2 Exam");
		return "Welcome To Exam";
	}

}
