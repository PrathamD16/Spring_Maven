package com.example.hello_springboot.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {

    @Test
    void hello() {
        HelloController obj = new HelloController();
        String res  = obj.hello("Pratham");
        assertEquals("Hello, World", res);
    }
}