package com.dkq.service;

import com.dkq.entity.Book;
import com.github.pagehelper.PageInfo;

public interface BookService {

    PageInfo<Book> queryAll(Integer pageNum, Integer pageSize) ;

    Integer delete(String id);

    Book queryById(String id);

    Integer edit(String id,String author,String price, String descr);
}
