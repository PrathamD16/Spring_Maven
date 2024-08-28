package com.pack.PersonPage.controller;
import java.util.*;
import com.pack.PersonPage.model.Person;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class PersonController {
    @RequestMapping(value = "/addPerson", method = RequestMethod.POST)
    public ModelAndView displayInfo(HttpServletRequest req, HttpServletResponse res){
        String name = req.getParameter("name");
        int ageParam = Integer.parseInt(req.getParameter("age"));
        String course = req.getParameter("course");
        Person obj = new Person(ageParam, name, course);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Greet");
//        mv.setViewName("hello");
        mv.addObject("obj", obj);
//        mv.addObject("user", obj.getName());
//        mv.addObject("age", obj.getAge());
//        mv.addObject("course_name", obj.getCourse_name());
        return mv;
    }

    @RequestMapping(value = "/addPerson", method = RequestMethod.GET)
    public ModelAndView displayinfo(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        return mv;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getHome(){
        return "PersonPage";
    }
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String GetDetails(HttpServletRequest req, HttpServletResponse res){

        return null;
    }
}
