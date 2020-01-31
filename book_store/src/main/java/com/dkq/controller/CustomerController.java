package com.dkq.controller;

import com.dkq.entity.Customer;
import com.dkq.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
@CrossOrigin(origins = "*")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/queryAll")
    public List<Customer> queryAll(){
        List<Customer> customers = customerService.queryAll();
        return customers;
    }

    @RequestMapping("/queryAllById")
    public Customer queryAllById(String id){
        Customer customer = customerService.queryAllById(id);
        return customer;
    }

    @RequestMapping("/edit")
    public String edit(String phone,String email,String address,String id){
        System.out.println(address);
        Integer edit = customerService.edit(phone, email, address,id);
        if (edit == 1){
            return "success";
        }
        return "error";
    }
}
