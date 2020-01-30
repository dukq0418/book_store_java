package com.dkq.controller;

import com.dkq.entity.Book;
import com.dkq.service.BookService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
@CrossOrigin(origins = "*")//解决跨域请求
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/queryAll")
    public PageInfo<Book> queryAll(Integer pageNum, Integer pageSize){
        PageInfo<Book> bookPageInfo = bookService.queryAll(pageNum, pageSize);
        return bookPageInfo;
    }

    @GetMapping("/queryById")
    public Book queryById(String id){
        Book book = bookService.queryById(id);
        return book;
    }

    @GetMapping("/edit")
    public String edit(String id,String author,String price, String descr){
        Integer edit = bookService.edit(id,author,price,descr);
        if (edit == 1){
            return "success";
        }else{
            return "error";
        }
    }

    @GetMapping("/delete")
    public String delete(String id){
        Integer delete = bookService.delete(id);
        if (delete == 1) {
            return "success";
        }else {
            return "error";
        }
    }
}
