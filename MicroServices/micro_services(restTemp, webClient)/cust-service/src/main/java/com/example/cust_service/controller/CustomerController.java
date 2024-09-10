package com.example.cust_service.controller;


import com.example.cust_service.response.CustomerResponse;
import com.example.cust_service.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @GetMapping("/customer/{id}")
    public ResponseEntity<CustomerResponse>getCustomerDetail(@PathVariable("id")int id){
        CustomerResponse res = customerService.getCustomerById(id);
        return ResponseEntity.status(HttpStatus.OK).body(res);
    }
}
