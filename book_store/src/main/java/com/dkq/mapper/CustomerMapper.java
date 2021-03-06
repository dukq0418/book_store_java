package com.dkq.mapper;

import com.dkq.entity.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CustomerMapper {
    List<Customer> queryAll();

    Customer queryAllById(String id);

    Integer edit(String phone, String email, String address,String id);
}
