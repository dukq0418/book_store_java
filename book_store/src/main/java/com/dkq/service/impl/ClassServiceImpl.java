package com.dkq.service.impl;

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
    public List<Class> queryAll() {
        return classMapper.queryAll();
    }
}
