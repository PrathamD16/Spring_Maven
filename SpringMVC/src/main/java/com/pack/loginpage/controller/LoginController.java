package com.pack.loginpage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    @RequestMapping("/")
    public ModelAndView getLoginPage(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("LoginPage");
        return mv;
    }

    @RequestMapping("/Signup")
    public ModelAndView getSignUpPage(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("SignUpPage");
        return mv;
    }

    @RequestMapping(value = "/validate", method = RequestMethod.POST)
    public ModelAndView validate(@RequestParam String username, @RequestParam String password){
        ModelAndView mv = new ModelAndView();
        if(username.equals("pratham16") && password.equals("pratham16")){
            mv.setViewName("success");
        }
        else{
            mv.setViewName("error");
        }
        return mv;
    }


}
