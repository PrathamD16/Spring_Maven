package com.pack.calculator.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalcController {
    @RequestMapping(value = "/result", method = RequestMethod.POST)
    public ModelAndView add(@RequestParam("num1")int i, @RequestParam("num2") int j){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Result");
        mv.addObject("ans", (i + j));
        return mv;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView home(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Cal");
        return mv;
    }


}
