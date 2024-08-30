package com.example.hello_springboot.controller;

import com.example.hello_springboot.entities.Customer;
import com.example.hello_springboot.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BankController {
    private final CustomerService customerService;
    //custructor based injection no need of autowiring
    public BankController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    public ResponseEntity<List<Customer>> getAllCustomers()
    {
        return  ResponseEntity.ok(customerService.getAllCustomer());

    }
}