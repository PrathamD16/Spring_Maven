package com.bank.cus.controller;
import com.bank.cus.response.AddressResponse;
import com.bank.cus.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    @Autowired
    AddressService service;
    @GetMapping("/customer/{id}")
    public ResponseEntity<AddressResponse>getCustomerDetail(@PathVariable("id")int id){
//        AddressResponse res = service.getAddressById(id);
//        return ResponseEntity.status(HttpStatus.OK).body(res);
        AddressResponse res = service.getCustomerAddressById(id);
        return ResponseEntity.status(HttpStatus.OK).body(res);
    }
}
