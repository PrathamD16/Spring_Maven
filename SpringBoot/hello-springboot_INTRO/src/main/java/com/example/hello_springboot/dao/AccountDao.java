package com.example.hello_springboot.dao;

import org.springframework.stereotype.Component;

@Component

public class AccountDao {
    public void addAccount(){
        System.out.println("This is add accountDao method");
    }
}
