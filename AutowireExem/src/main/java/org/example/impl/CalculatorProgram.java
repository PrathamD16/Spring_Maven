package org.example.impl;

import org.example.sample.Program;

public class CalculatorProgram implements Program {
    public CalculatorProgram() {
        System.out.println("CalculatorProgram constructor");
    }

    public void compile() {
        System.out.println("CP Compiling in CalculatorProgram");
    }
}
