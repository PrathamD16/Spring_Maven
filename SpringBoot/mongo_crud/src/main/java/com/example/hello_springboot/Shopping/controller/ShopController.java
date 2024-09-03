package com.example.hello_springboot.Shopping.controller;

import java.util.*;
import com.example.hello_springboot.Shopping.model.User;
import com.example.hello_springboot.Shopping.repo.ShopRepo;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shopping-service")
public class ShopController {
    @Autowired
    private ShopRepo repo;

    @PostMapping("/order-place")
    public String placeOrder(@RequestBody User obj){
        repo.save(obj);
        return "Order placed successfully";
    }

    @GetMapping("/getbycity/{city}")
    public List<User> getbyCity(@PathVariable String city){
        return repo.findByCity(city);
//        List<User>res = repo.findByCity(city_name);
//        return repo.findByCity(city_name);
//        return res;
//        return Optional.ofNullable(repo.findByCity(city))
//                .orElseThrow(() -> new RuntimeException("Error"));
//                .orElseThrow(() -> new ResourceNotFoundException
//                ("No users found in city: " + cityName));
    }



    @GetMapping("/test/{city_name}")
    public String getByCity(@PathVariable String city_name) throws Exception{
        List<User>arr = repo.findByCity(city_name);
        for(User x: arr){
            System.out.println(x.toString());
        }

        return "Hit the endpoint";
    }

    @GetMapping("/getbyname/{person_name}")
    public List<User> getByName(@PathVariable String person_name) {
        return new ArrayList<>(repo.findByName(person_name));
    }
//    @GetMapping("/getbyname/{person_name}")
//    public String getByName(@PathVariable String person_name) throws Exception {
//        return repo.findSingle(person_name);
//    }
}
