package com.example.hello_springboot.Shopping.repo;

import java.util.*;
import com.example.hello_springboot.Shopping.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ShopRepo extends MongoRepository<User, String> {
    @Query("{'Name':?0}")
    List<User>findByName(String name);

    @Query("{'Address.city:?0'}")
    List<User>findByCity(String city);

//    @Query("{name: ?0}")
//    String findSingle(String name);
}
