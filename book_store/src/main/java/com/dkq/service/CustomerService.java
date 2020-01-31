package com.dkq.service;

import com.dkq.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> queryAll();

    Customer queryAllById(String id);

    Integer edit(String phone, String email, String address,String id);
}
