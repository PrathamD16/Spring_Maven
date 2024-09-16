package com.example.hello_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloSpringApplication {

	@GetMapping("/")
	public String greet(){
		return "Hello User";
	}

	@GetMapping("/about")
	public String about(){
		return "This is about page";
	}

	public static void main(String[] args) {

		SpringApplication.run(HelloSpringApplication.class, args);
		System.out.println("Application started");
	}

}
