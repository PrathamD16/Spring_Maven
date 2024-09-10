package com.example.cust_service.response;
import com.example.cust_service.response.AddressResponse;
import jakarta.persistence.Column;

public class CustomerResponse {
    private int id;
    private String name;
    private String email;
    private String accountname;
    private AddressResponse address;

    public AddressResponse getAddress() {
        return address;
    }

    public void setAddress(AddressResponse address) {
        this.address = address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAccountname() {
        return accountname;
    }
}
