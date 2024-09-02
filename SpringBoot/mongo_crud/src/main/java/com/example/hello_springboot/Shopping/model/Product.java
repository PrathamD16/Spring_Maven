package com.example.hello_springboot.Shopping.model;

public class Product {
    private String prod_name;
    private int qty;
    private double price;

    public Product(String prod_name, int qty, double price) {
        this.prod_name = prod_name;
        this.qty = qty;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prod_name='" + prod_name + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }
}
