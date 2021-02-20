package com.neusoft.service;

import com.neusoft.dao.BookMapper;
import com.neusoft.pojo.Books;

import java.util.List;
import java.util.Map;

public class BookServiceImpl implements BookService {

    // Service 调用 Dao 层
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBookById(Books books) {
        return bookMapper.updateBookById(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    public List<Books> queryBookByName(String bookName) {
        return bookMapper.queryBookByName(bookName);
    }

    public List<Books> queryBooks(Map<Object,Object> map) {
        return bookMapper.queryBooks(map);
    }

}
