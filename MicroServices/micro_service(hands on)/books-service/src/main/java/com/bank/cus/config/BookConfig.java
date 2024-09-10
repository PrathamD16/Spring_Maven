package com.bank.cus.config;

import com.bank.cus.service.BookService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookConfig {
    @Bean
    public ModelMapper modelMapper()
    {
        return new ModelMapper();
    }
    @Bean
    public BookService bookService () { return new BookService(); }
}
