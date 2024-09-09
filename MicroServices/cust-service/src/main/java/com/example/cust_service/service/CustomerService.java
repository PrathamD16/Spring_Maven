package com.example.cust_service.service;

import com.example.cust_service.entity.Customer;
import com.example.cust_service.response.CustomerResponse;
import com.example.cust_service.respository.CustomerRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo repo;
    @Autowired
    private ModelMapper modelmapper;

    public CustomerResponse getCustomerById(int id){
        Customer customer = repo.findById(id).get();
        CustomerResponse res = modelmapper.map(customer, CustomerResponse.class);
        return res;
    }
}
