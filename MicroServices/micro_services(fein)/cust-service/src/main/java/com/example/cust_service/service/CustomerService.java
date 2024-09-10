package com.example.cust_service.service;

import com.example.cust_service.entity.Customer;
import com.example.cust_service.feignclient.AddressClient;
import com.example.cust_service.response.AddressResponse;
import com.example.cust_service.response.CustomerResponse;
import com.example.cust_service.respository.CustomerRepo;
import org.modelmapper.ModelMapper;
import com.example.cust_service.config.CustomerAppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class CustomerService {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${addressservice.base.url}")
    private String baseURL;

    @Autowired
    private CustomerRepo repo;
    @Autowired
    private ModelMapper modelmapper;

    @Autowired
    private WebClient webClient;

//    For feign client
    @Autowired
    private AddressClient addressClient;

//    public CustomerService(RestTemplate restTemplate){
//        this.restTemplate = restTemplate;
//        System.out.println(baseURL);
////        CustomerAppConfig obj = new CustomerAppConfig();
////        modelmapper = obj.modelMapper();
//    }

//    public CustomerService(@Value("${addressservice.base.url}") String baseURL, RestTemplateBuilder builder){
//        System.out.println("uri: " + baseURL);
//        this.restTemplate = builder.rootUri(baseURL).build();
//    }

//    ****Using rest template
    public CustomerResponse getCustomerById(int id){

        AddressResponse obj =  addressClient.getCustomerAddressById(id);
        Customer customer = repo.findById(id).get();
        CustomerResponse res = modelmapper.map(customer, CustomerResponse.class);
        res.setAddress(obj);
        return res;
    }

}
