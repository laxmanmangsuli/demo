package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class Ms01MicroServiceEurekaServerApplication {

	public static void main(String[] args) {
		System.out.println("This is Eureka Server");
		SpringApplication.run(Ms01MicroServiceEurekaServerApplication.class, args);
	}

}
