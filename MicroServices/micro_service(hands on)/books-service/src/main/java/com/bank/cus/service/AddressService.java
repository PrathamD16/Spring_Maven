package com.bank.cus.service;

import com.bank.cus.entity.Address;
import com.bank.cus.repository.AddressRepo;
import com.bank.cus.response.AddressResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;
import org.springframework.ui.Model;

@Service
public class AddressService {
    @Autowired
    private AddressRepo repo;
    @Autowired
    private ModelMapper mapper;

    public AddressResponse getAddressById(int ind){
        Address address = repo.findById(ind).get();
        return mapper.map(address, AddressResponse.class);
    }


    public AddressResponse getCustomerAddressById(int id){
        Address address = repo.findAddressByCustomerId(id);
        return mapper.map(address, AddressResponse.class);
    }

}
