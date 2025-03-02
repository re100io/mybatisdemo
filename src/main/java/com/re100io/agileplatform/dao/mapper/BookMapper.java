package com.re100io.agileplatform.dao.mapper;

import com.re100io.agileplatform.model.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BookMapper {
    List<Book> getAllBooks();

    Book getBookById(@Param("id") Long id);

    void insertBook(Book book);

    void updateBook(Book book);

    void deleteBook(Long id);

    List<Book> getBookByName(String name);

    List<Book> getBooksByPage(@Param("start") int start, @Param("pageSize") int pageSize);
}

