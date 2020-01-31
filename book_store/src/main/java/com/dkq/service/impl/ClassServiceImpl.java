package com.dkq.service.impl;

import com.dkq.entity.BookClass;
import com.dkq.mapper.ClassMapper;
import com.dkq.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl implements ClassService {

    @Autowired
    private ClassMapper classMapper;

    @Override
    public List<BookClass> queryAll() {
        return classMapper.queryAll();
    }

    @Override
    public Integer delete(String id) {
        return classMapper.delete(id);
    }

    @Override
    public Integer add(String name, String descr) {
        return classMapper.add(name,descr);
    }
}
