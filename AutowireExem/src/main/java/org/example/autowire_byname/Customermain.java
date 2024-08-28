package org.example.autowire_byname;

import org.example.autowire_byname.model.Customer;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Customermain {
    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Object bean= context.getBean("customer");
        context.close();
        System.out.println((Customer)bean);

    }
}
