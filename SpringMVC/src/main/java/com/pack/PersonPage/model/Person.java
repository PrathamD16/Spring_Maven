package com.pack.PersonPage.model;
public class Person {
    private int age;
    private String name;
    private String course_name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(int age, String name, String course_name) {
        this.age = age;
        this.name = name;
        this.course_name = course_name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }
}
