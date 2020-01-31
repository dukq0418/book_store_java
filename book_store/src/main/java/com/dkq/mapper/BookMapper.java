package com.dkq.mapper;

import com.dkq.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface BookMapper {

    List<Book> queryAll();

    Integer delete(String id);

    Book queryById(String id);

    Integer edit(String id,String author,String price, String descr);

    Integer add(String bookname, String author, String price, String classid, String descr, String path);
}
