package org.example;

import org.example.config.StudentConfig;
import org.example.modl.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var cfg = StudentConfig.class;
        try(var context = new AnnotationConfigApplicationContext(cfg))
        {
            var student = context.getBean("GetStudent", Student.class);
            System.out.println(student);
        }

    }
}