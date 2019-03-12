package com.example.demo.controller;

import com.example.demo.entity.Admin;
import com.example.demo.enums.StatusCode;
import com.example.demo.exceptions.ApiException;
import com.example.demo.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.demo.entity.apiInfo;

import javax.servlet.http.HttpServletRequest;

@Controller
public class login {

    @Autowired
    AdminService adminService;

    @GetMapping(value = "login")
    public String showLogin() {
        return "login";
    }

    @PostMapping(value = "doLogin")
    @ResponseBody
    public apiInfo<Admin> doLogin(
            @RequestParam(value = "username") String  username,
            @RequestParam(value = "password") String  password,
            HttpServletRequest request
    ) throws ApiException {
        Admin admin = adminService.doLogin(username, password);

        request.getSession().setAttribute("username", admin.getUsername());
        request.getSession().setAttribute("id", admin.getId());

        apiInfo<Admin> info = new apiInfo<>();
        info.setCode(StatusCode.SUCCESS.getCode());
        info.setMsg(StatusCode.SUCCESS.getValue());
        info.setData(admin);

        return info;
    }
}
