package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoginMicroserviceApplication {

	public static void main(String[] args) {
		System.out.println("LoginMicroserviceApplication---------1");
		SpringApplication.run(LoginMicroserviceApplication.class, args);
		System.out.println("LoginMicroserviceApplication---------2");
	}

}
