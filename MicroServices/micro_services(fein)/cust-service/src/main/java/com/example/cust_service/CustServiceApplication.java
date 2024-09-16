package com.example.cust_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.example.cust_service.feignclient.AddressClient")
public class CustServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(CustServiceApplication.class, args);
		System.out.println("Started at 8080");
	}

}
