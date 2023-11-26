package com.re100io.mybatisdemo.mapper;

import com.re100io.mybatisdemo.entity.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BookMapper {
    @Select("SELECT * FROM book")
    List<Book> getAllBooks();


    @Select("SELECT * FROM book WHERE id = #{id}")
    Book getBookById(@Param("id") Long id);

    @Insert("INSERT INTO book(title, author, publication_year, price) VALUES(#{title},#{author}, #{publicationYear}, #{price})")
    void insertBook(Book book);

    @Update("UPDATE book SET title = #{title}, author = #{author}, publication_year = #{publicationYear}, price = #{price} WHERE id = #{id}")
    void updateBook(Book book);

    @Delete("DELETE FROM book WHERE id = #{id}")
    void deleteBook(Long id);

    @Select("SELECT * FROM book LIMIT #{start}, #{pageSize}")
    List<Book> getBooksByPage(@Param("start") int start, @Param("pageSize") int pageSize);
}

