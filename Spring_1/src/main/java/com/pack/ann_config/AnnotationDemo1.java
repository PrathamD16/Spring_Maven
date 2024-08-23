package com.pack.ann_config;

import org.springframework.stereotype.Component;

@Component
public class AnnotationDemo1 {
    public void greetMe(String name){
        System.out.println("Hello" + name);
    }
}
