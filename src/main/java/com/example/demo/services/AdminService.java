package com.example.demo.services;

import com.example.demo.entity.Admin;
import com.example.demo.exceptions.ApiException;
import org.springframework.stereotype.Service;

public interface AdminService {
    public Admin getAdminInfo(String name);

    public Admin doLogin(String username, String password) throws ApiException;
}
