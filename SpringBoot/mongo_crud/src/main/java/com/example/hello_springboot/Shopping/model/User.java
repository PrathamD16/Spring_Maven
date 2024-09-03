package com.example.hello_springboot.Shopping.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Data
@Document(collection = "order_db")
@AllArgsConstructor
@NoArgsConstructor
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
}
