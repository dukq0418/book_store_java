package com.dkq.service;

import com.dkq.entity.BookClass;

import java.util.List;

public interface ClassService {

    List<BookClass> queryAll();

    Integer delete(String id);

    Integer add(String name, String descr);
}
