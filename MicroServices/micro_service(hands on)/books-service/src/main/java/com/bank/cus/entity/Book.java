package com.bank.cus.entity;

import jakarta.persistence.*;

@Entity(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "auth_id")
    private int auth_id;

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuth_id(int auth_id) {
        this.auth_id = auth_id;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getAuth_id() {
        return auth_id;
    }
}
