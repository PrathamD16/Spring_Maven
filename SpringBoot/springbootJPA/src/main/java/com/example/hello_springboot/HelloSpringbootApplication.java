package com.example.hello_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringbootApplication {

	public static void main(String[] args) {
		System.out.println("Starting Project");
		SpringApplication.run(HelloSpringbootApplication.class, args);
	}

}
