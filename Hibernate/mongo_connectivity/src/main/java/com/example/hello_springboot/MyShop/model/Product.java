package com.example.hello_springboot.MyShop.model;

//package com.pack.mngodb.model;import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.springframework.data.mongodb.core.mapping.Document;

//@Data
//@AllArgsConstructorpublic
public class Product {
    private String prname;
    private int qty;
    private int price;

    public Product(String prname, int qty, int price) {
        this.prname = prname;
        this.qty = qty;
        this.price = price;
    }
}
