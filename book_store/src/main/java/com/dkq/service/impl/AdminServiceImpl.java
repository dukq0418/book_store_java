package com.dkq.service.impl;

import com.dkq.entity.Admin;
import com.dkq.mapper.AdminMapper;
import com.dkq.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper AdminMapper;

    @Override
    public Admin login(String username) {
        return AdminMapper.login(username);
    }
}
