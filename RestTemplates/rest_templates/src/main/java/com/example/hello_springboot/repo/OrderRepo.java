package com.example.hello_springboot.repo;

import com.example.hello_springboot.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepo extends MongoRepository<User, String> {
}
