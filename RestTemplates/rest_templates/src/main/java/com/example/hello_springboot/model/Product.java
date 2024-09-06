package com.example.hello_springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Product {
    private String prod_name;
    private int qty;
    private double price;


    @Override
    public String toString() {
        return "Product{" +
                "prod_name='" + prod_name + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }
}
