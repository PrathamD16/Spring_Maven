package com.example.cust_service.feignclient;

import com.example.cust_service.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "demofeign", url = "http://localhost:4000/address-service/api/")
public interface AddressClient {
    @GetMapping("address-service/{id}")
    AddressResponse getCustomerAddressById(@PathVariable("id") int id);
}
