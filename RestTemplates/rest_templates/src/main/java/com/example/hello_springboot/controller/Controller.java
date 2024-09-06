package com.example.hello_springboot.controller;


import com.example.hello_springboot.model.User;
import com.example.hello_springboot.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@RestController
@RequestMapping("/orders")
public class Controller {
    @Autowired
    RestTemplate temp;

    @Autowired
    OrderRepo repo;

    @GetMapping("/test")
    public String test(){
        return "Test Successful";
    }

    @PostMapping("/submit-orders")
    public String placeOrder(@RequestBody User obj){
        repo.save(obj);
        return "Order-placed";
    }

    @GetMapping("/get-orders")
    public ResponseEntity<List<User>>getOrders(){
        List<User>user = repo.findAll();
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
//    public List<User> getOrders(){
//        return new ArrayList<>(ResponseEntity<>(repo.findAll(), ));
//    }
}
