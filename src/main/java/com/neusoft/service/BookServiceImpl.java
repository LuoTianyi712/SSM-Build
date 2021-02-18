package com.neusoft.service;

import com.neusoft.dao.BookMapper;
import com.neusoft.pojo.Books;

public class BookServiceImpl implements BookService{

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

    public Books queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
