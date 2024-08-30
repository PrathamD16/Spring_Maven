package com.example.hello_springboot.controller;

import com.example.hello_springboot.model.UserModel;
import com.example.hello_springboot.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class UserController {
    @Autowired
    private UserRepo repo;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String defaultPage(){
        return "LoginPage.jsp";
    }

    @GetMapping("/signup")
    public ModelAndView signinPage(){
        ModelAndView mv  = new ModelAndView();
        mv.setViewName("SignUp.jsp");
        return mv;
    }

    @PostMapping("/test")
    public UserModel test(@RequestBody UserModel obj){
        return repo.save(obj);
    }


    @PostMapping("/newuser")
    public ModelAndView addNewUser(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("email") String email){
        ModelAndView mv = new ModelAndView();
//        System.out.println(username + " " + password + " " + email);
        repo.save(new UserModel(username, password, email));
        mv.setViewName("LoginPage.jsp");
        return mv;

    }

}
