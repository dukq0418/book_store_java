package com.dkq.service.impl;

import com.dkq.entity.Customer;
import com.dkq.mapper.CustomerMapper;
import com.dkq.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public List<Customer> queryAll() {
        return customerMapper.queryAll();
    }

    @Override
    public Customer queryAllById(String id) {
        return customerMapper.queryAllById(id);
    }

    @Override
    public Integer edit(String phone, String email, String address,String id) {
        return customerMapper.edit(phone,email,address,id);
    }
}
