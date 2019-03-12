package com.example.demo.dao;

import com.example.demo.entity.Admin;
import tk.mybatis.mapper.common.Mapper;

public interface AdminMapper extends Mapper<Admin> {
    Admin selectByUsername(String name);
}