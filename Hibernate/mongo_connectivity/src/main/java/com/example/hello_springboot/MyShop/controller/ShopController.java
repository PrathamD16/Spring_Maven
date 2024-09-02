package com.example.hello_springboot.MyShop.controller;

import com.example.hello_springboot.MyShop.model.User;
import com.example.hello_springboot.MyShop.repo.ShoppingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shopping-Service")
public class ShopController {
    @Autowired
    private ShoppingRepo repo;

    public ShopController(ShoppingRepo repo) {
//        this.shoppingRepo = shoppingRepo;
        this.repo = repo;
    }

    @PostMapping("/orderPlace")
    public String placeOrder(@RequestBody User user) {
        repo.save(user);
        return "Order placed successfully";
    }

//    @GetMapping("/getByCity")
//    public String searchByCity()
}