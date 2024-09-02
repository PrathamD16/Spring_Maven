package com.example.hello_springboot.controller;


import com.example.hello_springboot.model.AccountModel;
import com.example.hello_springboot.repo.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
public class AccountController {
    @Autowired
    private AccountRepo accrepo;

    @PostMapping("/addAccount")
    public AccountModel addAccount(@RequestBody AccountModel account){
        return accrepo.save(account);
    }

    @GetMapping("/getAccount")
    public List<AccountModel> getAccountDetails(){
        return accrepo.findAll();
    }
}
