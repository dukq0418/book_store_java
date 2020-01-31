package com.dkq.controller;

import com.dkq.entity.BookClass;
import com.dkq.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bookClass")
@CrossOrigin(origins = "*")//解决跨域请求
public class classController {
    @Autowired
    private ClassService classService;

    @GetMapping("/queryAll")
    public List<BookClass> queryAll(){
        List<BookClass> classes = classService.queryAll();
        return classes;
    }

    @GetMapping("/delete")
    public Integer delete(String id){
        Integer delete = classService.delete(id);
        return delete;
    }

    @GetMapping("/add")
    public Integer add(String name,String descr){
        Integer add = classService.add(name,descr);
        return add;
    }
}
