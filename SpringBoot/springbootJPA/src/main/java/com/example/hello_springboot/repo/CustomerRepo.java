package com.example.hello_springboot.repo;

import com.example.hello_springboot.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Integer>
{
    //Spring data jpa  will automatically
    // provide implementation for it when using existsBy{fieldName}
    boolean existsById(Integer id);
}
