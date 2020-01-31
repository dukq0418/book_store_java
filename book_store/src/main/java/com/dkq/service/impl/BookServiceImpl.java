package com.dkq.service.impl;

import com.dkq.entity.Book;
import com.dkq.mapper.BookMapper;
import com.dkq.service.BookService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public PageInfo<Book> queryAll(Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Book> bookList = bookMapper.queryAll();
        return new PageInfo<Book>(bookList);
    }

    @Override
    public Integer delete(String id) {
        return bookMapper.delete(id);
    }

    @Override
    public Book queryById(String id) {
        return bookMapper.queryById(id);
    }

    @Override
    public Integer edit(String id,String author,String price, String descr) {
        return bookMapper.edit(id,author,price,descr);
    }

    @Override
    public Integer add(String bookname, String author, String price, String classid, String descr, String path) {
        return bookMapper.add(bookname,author,price,classid,descr,path);
    }

}
