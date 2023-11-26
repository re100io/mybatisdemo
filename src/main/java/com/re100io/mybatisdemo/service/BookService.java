package com.re100io.mybatisdemo.service;


import com.re100io.mybatisdemo.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();

    Book getBookById(Long id);

    void insertBook(Book book);

    void updateBook(Book book);

    void deleteBook(Long id);

    public List<Book> getBooksByPage(int page, int pageSize);
}
