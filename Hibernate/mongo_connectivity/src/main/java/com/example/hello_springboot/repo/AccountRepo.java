package com.example.hello_springboot.repo;

import com.example.hello_springboot.model.AccountModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepo extends MongoRepository<AccountModel, String>{

}
