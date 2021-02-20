package com.neusoft.controller;

import com.neusoft.pojo.Books;
import com.neusoft.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @RequestMapping("/toAddPage")
    public String toAddPage(){
        return "addBook";
    }

    // 添加书籍请求
    @RequestMapping("/addBook")
    public String addBook(Books books){
        System.out.println("addBook: "+books);
        if (bookService.addBook(books) >0){
            System.out.println("add book success");
        }
        // 重定向到allBook请求
        return "redirect:/book/allBook";
    }

    // 跳转到修改书籍页面
    @RequestMapping("/toUpdatePage")
    public String toUpdatePage(int id, Model model){
        Books books = bookService.queryBookById(id);
        model.addAttribute("books",books);
        return "updateBook";
    }

    // 修改书籍
    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        System.out.println("updateBooks:"+books);
        if (bookService.updateBookById(books) > 0) {
            System.out.println("update success");
        }else {
            System.out.println("false");
        }
        return "redirect:/book/allBook";
    }

    // 删除书籍
    @RequestMapping("/deleteBook/{bookId}")
    public String deleteBook(@PathVariable("bookId") int id){
        if (bookService.deleteBookById(id) > 0) {
            System.out.println("delete success");
        }
        return "redirect:/book/allBook";
    }

//    // 查询书籍
//    @RequestMapping("/queryBook")
//    public String queryBook(String queryBookName, Model model){
//        List<Books> booksList = bookService.queryBookByName(queryBookName);
//        if (queryBookName.isEmpty()) {
//            return "redirect:/book/allBook";
//        } else if (booksList == null)
//        {
//            return "allBook";
//        }else {
//            model.addAttribute("list",booksList);
//            return "allBook";
//        }
//    }

    @RequestMapping("/queryBook")
    public String queryBooksWhere(String queryText, Model model){

        HashMap<Object, Object> map = new HashMap<>();

        map.put("bookID",queryText);
        map.put("bookName",queryText);

        List<Books> booksList = bookService.queryBooks(map);
        if (queryText.isEmpty()) {
            return "redirect:/book/allBook";
        } else if (booksList == null)
        {
            return "allBook";
        }else {
            model.addAttribute("list",booksList);
            return "allBook";
        }
    }
}
