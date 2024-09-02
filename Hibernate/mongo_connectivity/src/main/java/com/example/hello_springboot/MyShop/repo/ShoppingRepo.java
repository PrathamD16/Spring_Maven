package com.example.hello_springboot.MyShop.repo;
import java.util.*;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.hello_springboot.MyShop.model.User;

import org.springframework.data.mongodb.repository.Query;

public interface ShoppingRepo extends MongoRepository<User, String> {
    List<User>findByName(String name);

    @Query("{'Address.city':?0}")
    List<User>findByCity(String city);
}
