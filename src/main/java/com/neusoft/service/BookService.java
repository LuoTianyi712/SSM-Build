package com.neusoft.service;

import com.neusoft.pojo.Books;

import java.util.List;
import java.util.Map;

public interface BookService {
    // 增加一本书
    int addBook(Books books);
    // 删除一本书
    int deleteBookById(int id);
    // 修改一本书
    int updateBookById(Books books);
    // 查询一本书
    Books queryBookById(int id);
    // 查询所有书
    List<Books> queryAllBook();

    List<Books> queryBookByName(String bookName);

    List<Books> queryBooks(Map<Object,Object> map);
}
