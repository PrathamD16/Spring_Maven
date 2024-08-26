package org.example.impl;

import org.example.sample.Program;

public class Jvm implements Program {
    public Jvm() {
        System.out.println("Jvm Constructor");
    }

    public void compile() {
        System.out.println("JVM Compiling Program");
    }
}

