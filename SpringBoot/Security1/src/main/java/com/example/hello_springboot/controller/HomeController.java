package com.example.hello_springboot.controller;

import com.example.hello_springboot.model.UserModel;
import com.example.hello_springboot.repo.UserRepo;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    private UserRepo repo;
    @RequestMapping("/")
    public ModelAndView home(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Login.jsp");
        return mv;
    }

    @RequestMapping("/signup")
    public ModelAndView singup(){
        ModelAndView mv =new ModelAndView();
        mv.setViewName("SignUp.jsp");
        return mv;
    }

//    @RequestMapping("/test")
    public UserModel addUser(@RequestBody UserModel obj){
        return repo.save(obj);
    }
//    Wher new user signin
    @PostMapping("/newuser")
    public ModelAndView addnewuser(@RequestParam("username")String username, @RequestParam("password") String password, @RequestParam("email") String email) {
        repo.save(new UserModel(username, password, email));
        ModelAndView mv = new ModelAndView();
        mv.setViewName("LoginPage");
        return mv;
    }

//    When user signin
    @RequestMapping("/result")
    public String result(){
        return "Welcome";
    }
//    public ModelAndView home(){
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("demo");
//        return mv;
//    }
}
