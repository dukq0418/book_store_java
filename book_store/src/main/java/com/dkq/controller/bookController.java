package com.dkq.controller;

import com.dkq.entity.Book;
import com.dkq.service.BookService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
@RequestMapping("/book")
@CrossOrigin(origins = "*")//解决跨域请求
public class bookController {

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

    @PostMapping("/upload")
    public String upload(MultipartFile multipartFile) throws IOException {
        //获取文件名
        String fileName1 = multipartFile.getOriginalFilename();
        String path = "D:\\environment\\tomcat\\apache-tomcat-9.0.30\\webapps\\image";
        String fileName = UUID.randomUUID().toString()+fileName1;
        File file = new File(path, fileName);
        multipartFile.transferTo(file);
        return "http://localhost:8082/image/"+fileName;
    }

    @GetMapping("/add")
    public Integer add(String bookname,String author,String price,String classid,String descr,String path){
        Integer add = bookService.add(bookname, author, price, classid, descr, path);
        return add;
    }
}
