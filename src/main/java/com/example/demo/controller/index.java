package com.example.demo.controller;

import com.example.demo.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class index {

    @Autowired
    @Qualifier("admin")
    AdminService adminService;

    @GetMapping(value = "/")
    public String index(ModelMap m, HttpServletRequest request) throws Exception {

        String username = (String) request.getSession().getAttribute("username");
        m.addAttribute("username", username);

        return "admin/home";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "admin/welcome";
    }
}
