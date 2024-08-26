package org.example.config;

import org.example.modl.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean
    public Student GetStudent(){
        return new Student(10, "Neha", "Ecommerce");
    }
}
