package com.example.hello_springboot.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component

public class MyLogginAspect {
    @After("execution(public void addAcount())")
    public  void dotheAspectStuff(){
        System.out.println("do the aspecting");
    }
}
