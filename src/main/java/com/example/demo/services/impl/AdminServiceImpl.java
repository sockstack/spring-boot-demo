package com.example.demo.services.impl;

import com.example.demo.dao.AdminMapper;
import com.example.demo.entity.Admin;
import com.example.demo.exceptions.ApiException;
import com.example.demo.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

@Service("admin")
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminMapper adminMapper;

    @Override
    public Admin getAdminInfo(String name) {
        return adminMapper.selectByUsername(name);
    }

    @Override
    public Admin doLogin(String username, String password) throws ApiException {
        Admin admin = adminMapper.selectByUsername(username);

        if (null == admin) {
            throw new ApiException("管理员不存在");
        }

        if (!admin.getPassword().equals(DigestUtils.md5DigestAsHex(password.getBytes()))) {
            throw new ApiException("密码错误");
        }

        return admin;
    }
}
