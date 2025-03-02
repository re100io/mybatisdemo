package com.re100io.agileplatform.service;


import com.re100io.agileplatform.model.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();

    Book getBookById(Long id);

    void insertBook(Book book);

    void updateBook(Book book);

    void deleteBook(Long id);


    public List<Book> getBooksByPage(int page, int pageSize);
}
