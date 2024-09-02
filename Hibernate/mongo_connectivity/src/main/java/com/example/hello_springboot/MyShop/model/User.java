package com.example.hello_springboot.MyShop.model;

//package com.pack.mngodb.model;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.aggregation.ArithmeticOperators;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

//@Data
@Document(collection = "order_db")
//@AllArgsConstructor
//@NoArgsConstructorpublic
public class User {
    @Id
    private int id;
    private String name;
    private String gender;
    private List<Product> productList;
    private Address address;

    public User(){}

    public User(int id, String name, String gender, List<Product> productList, Address address) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.productList = productList;
        this.address = address;
    }

}