package com.example.hello_springboot.repository;

import com.example.hello_springboot.model.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<UserModel, String> {
}
