package com.example.hello_springboot.Shopping.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "order_db")
public class User {
    @Id
    private int id;
    private String name;
    private String gender;
    private List<Product> productList;
    private Address address;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", productList=" + productList +
                ", address=" + address +
                '}';
    }

    public User(int id, String name, String gender, List<Product> productList, Address address) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.productList = productList;
        this.address = address;

    }

    public Address getAddress() {
        return address;
    }
}
