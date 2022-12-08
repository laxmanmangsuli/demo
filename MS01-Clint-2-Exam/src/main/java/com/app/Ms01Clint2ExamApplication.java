package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class Ms01Clint2ExamApplication {

	public static void main(String[] args) {
		System.out.println("This is Clint 2 Exam..");
		SpringApplication.run(Ms01Clint2ExamApplication.class, args);
	}

}
