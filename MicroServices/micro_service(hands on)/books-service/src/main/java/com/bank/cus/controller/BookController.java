package com.bank.cus.controller;

import com.bank.cus.response.AddressResponse;
import com.bank.cus.response.BookResponse;
import com.bank.cus.service.AddressService;
import com.bank.cus.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/book-service/test")
    public String getResponse(){
        return "Hello";
    }

    @GetMapping("/book-service/{name}")
    public ResponseEntity<List<BookResponse>>getByNameBooks(@PathVariable("name") String name){
        List<BookResponse>res = bookService.getBooksByName(name);
        return ResponseEntity.status(HttpStatus.OK).body(res);
    }

}
