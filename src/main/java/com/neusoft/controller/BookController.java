package com.neusoft.controller;

import com.neusoft.pojo.Books;
import com.neusoft.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    // controller 调用 Service层
    @Autowired
    @Qualifier("bookServiceImpl")
    private BookService bookService;

    // 查询全部书籍，并返回一个书籍展示页面
    @RequestMapping("/allBook")
    public String queryAllBook(Model model){
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list", list);
        return "allBook";
    }

    // 跳转到增加书籍页面
    @RequestMapping("/toAddBook")
    public String toAddPage(){
        return "addBook";
    }

    // 添加书籍请求
    @RequestMapping("/addBook")
    public String addBook(Books books){
        System.out.println("addBook: "+books);
        bookService.addBook(books);
        // 重定向到allBook请求
        return "redirect:/book/allBook";
    }
}
