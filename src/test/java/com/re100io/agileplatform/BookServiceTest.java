package com.re100io.agileplatform;


import com.re100io.agileplatform.model.Book;
import com.re100io.agileplatform.dao.mapper.BookMapper;
import com.re100io.agileplatform.service.BookService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import java.util.Arrays;
import java.util.List;
import static org.mockito.Mockito.*;

@SpringBootTest
public class BookServiceTest {

    @Autowired
    private BookService bookService;

    @MockBean
    private BookMapper bookMapper;

    @BeforeEach
    public void setUp() {
        // 定义模拟数据和行为
        Book book1 = new Book(1L, "Book 1", "Author 1", 2023, 19.99);
        Book book2 = new Book(2L, "Book 2", "Author 2", 2022, 29.99);

        when(bookMapper.getAllBooks()).thenReturn(Arrays.asList(book1, book2));
        when(bookMapper.getBookById(1L)).thenReturn(book1);
        when(bookMapper.getBookById(2L)).thenReturn(book2);
    }

    @Test
    public void testGetAllBooks() {
        List<Book> books = bookService.getAllBooks();
        // 验证是否成功调用bookMapper.getAllBooks()
        verify(bookMapper, times(1)).getAllBooks();
        // 验证返回的列表是否符合预期
        assert books.size() == 2;
        assert books.get(0).getTitle().equals("Book 1");
        assert books.get(1).getTitle().equals("Book 2");
    }

    @Test
    public void testGetBookById() {
        Book book = bookService.getBookById(1L);
        // 验证是否成功调用bookMapper.getBookById(1L)
        verify(bookMapper, times(1)).getBookById(1L);
        // 验证返回的Book对象是否符合预期
        assert book.getId() == 1L;
        assert book.getTitle().equals("Book 1");
    }

    @Test
    public void testInsertBook() {
        Book newBook = new Book(null, "New Book", "New Author", 2023, 39.99);
        bookService.insertBook(newBook);
        // 验证是否成功调用bookMapper.insertBook()并传递了newBook对象
        verify(bookMapper, times(1)).insertBook(newBook);
    }

    @Test
    public void testUpdateBook() {
        Book updatedBook = new Book(1L, "Updated Book", "Updated Author", 2021, 25.99);
        bookService.updateBook(updatedBook);
        // 验证是否成功调用bookMapper.updateBook()并传递了updatedBook对象
        verify(bookMapper, times(1)).updateBook(updatedBook);
    }

    @Test
    public void testDeleteBook() {
        bookService.deleteBook(2L);
        // 验证是否成功调用bookMapper.deleteBook()并传递了2L作为参数
        verify(bookMapper, times(1)).deleteBook(2L);
    }
}
