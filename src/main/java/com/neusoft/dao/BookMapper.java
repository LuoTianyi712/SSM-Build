package com.neusoft.dao;

import com.neusoft.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BookMapper {
    // 增加一本书
    int addBook(Books books);
    // 删除一本书
    int deleteBookById(@Param("bookId") int id);
    // 修改一本书
    int updateBookById(Books books);
    // 查询一本书
    Books queryBookById(@Param("bookId") int id);
    // 查询所有书
    List<Books> queryAllBook();
    // 按照书名查询
    List<Books> queryBookByName(@Param("bookName") String bookName);

    List<Books> queryBooks(Map<Object,Object> map);
}
