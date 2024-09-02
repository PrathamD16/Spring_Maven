package com.example.hello_springboot.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class AccountModel {
    @Id
    private String id;
    private String accNumber;
    private String accName;

    public AccountModel(String accNumber, String accName) {
        this.accNumber = accNumber;
        this.accName = accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public String getAccName() {
        return accName;
    }
}
