package org.example.model;
import org.example.sample.Program;

public class Dev {

    private Program com;

    public Dev() {
        System.out.println("Dev constructor");
    }

    public Dev(Program comp) {
        this.com = comp;
    }

    public Program getPro() {
        return com;
    }

    public void setPro(Program com) {
        this.com = com;
    }


    public void build() {

        System.out.println("working on Awesome Project");
        com.compile();
    }
}