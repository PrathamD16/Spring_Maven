package com.example.hello_springboot.controller;

import com.example.hello_springboot.model.UserModel;
import com.example.hello_springboot.repository.UserRepo;
import io.swagger.models.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepo repo;

    @GetMapping("/")
    public ModelAndView defaultPage(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("LoginPage.jsp");
        return mv;
    }

    @GetMapping("/signup")
    public ModelAndView signinPage(){
        ModelAndView mv  = new ModelAndView();
        mv.setViewName("SignUp.jsp");
        return mv;
    }




    @PostMapping("/result")
    public ModelAndView loginUser(@RequestParam("username")String username, @RequestParam("password")String password){
        ModelAndView mv = new ModelAndView();
        boolean f1 = false;
        for(UserModel obj: repo.findAll()){
            if(obj.getUsername().equals(username) && obj.getPassword().equals(password)){
                f1 = true;
                mv.setViewName("Welcome.jsp");
                mv.addObject("username", obj.getUsername());
                break;
            }
        }
        if(!f1){
            mv.setViewName("Error.jsp");
        }
        return mv;
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
