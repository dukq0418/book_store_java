package com.dkq.mapper;

import com.dkq.entity.BookClass;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ClassMapper {
    List<BookClass> queryAll();

    Integer delete(String id);

    Integer add(String name, String descr);
}
