package com.pack.student_pack;

public class Students {
    private int id;
    String st_name, st_course;

    public String getSt_name() {
        return st_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSt_Name() {
        return st_name;
    }

    public void setSt_name(String st_name) {
        this.st_name = st_name;
    }

    public String getSt_course() {
        return st_course;
    }

    public void setSt_course(String st_course) {
        this.st_course = st_course;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", st_name='" + st_name + '\'' +
                ", st_course='" + st_course + '\'' +
                '}';
    }
}
