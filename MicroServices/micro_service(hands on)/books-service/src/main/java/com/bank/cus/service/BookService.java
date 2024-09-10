package com.bank.cus.service;

import com.bank.cus.entity.Book;
import com.bank.cus.repository.BookRepo;
import com.bank.cus.response.BookResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

public class BookService {
    @Autowired
    ModelMapper modelMapper;

    @Autowired
    BookRepo repo;

    public List<BookResponse>getBooksByName(String name){
        List<Book>list = (List) repo.searchBookByName(name);
        List<BookResponse>res = new ArrayList<>();
        for(Book x: list){
            res.add(modelMapper.map(x, BookResponse.class));
        }
        return res;
    }


}
