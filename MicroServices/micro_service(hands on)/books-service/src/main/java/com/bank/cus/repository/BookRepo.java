package com.bank.cus.repository;

import com.bank.cus.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BookRepo extends JpaRepository<Book, Integer> {
    @Query(nativeQuery = true,value = "select b.id, b.title from author a join books b on a.id = b.auth_id where a.name=:auth_name")
    Book searchBookByName(@Param("auth_name")String auth_name);

}
