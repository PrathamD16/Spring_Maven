package org.example.modl;

public class Student {
    private int rollno;
    private String name;
    private String course;

    public Student(int rollno, String name, String course) {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }
}
