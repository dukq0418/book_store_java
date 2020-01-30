package com.dkq.controller;

import com.dkq.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/class")
@CrossOrigin(origins = "*")
public class classController {
    @Autowired
    private ClassService classService;

    @GetMapping("/queryAll")
    public List<Class> queryAll(){
        List<Class> classes = classService.queryAll();
        return classes;
    }
}
