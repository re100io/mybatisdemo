package com.re100io.mybatisdemo.service;


import com.re100io.mybatisdemo.mapper.BookMapper;
import com.re100io.mybatisdemo.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private final BookMapper bookMapper;

    @Autowired
    public BookServiceImpl(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookMapper.getAllBooks();
    }

    @Override
    public Book getBookById(Long id) {
        return bookMapper.getBookById(id);
    }

    @Override
    public void insertBook(Book book) {
        bookMapper.insertBook(book);
    }

    @Override
    public void updateBook(Book book) {
        bookMapper.updateBook(book);
    }

    @Override
    public void deleteBook(Long id) {
        bookMapper.deleteBook(id);
    }

    @Override
    public List<Book> getBooksByPage(int page, int pageSize) {
        int start = (page - 1) * pageSize;
        return bookMapper.getBooksByPage(start, pageSize);
    }
}

