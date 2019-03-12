package com.example.demo.handler;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginHandler extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object username = request.getSession().getAttribute("username");
        System.out.println("拦截器");
        if (null == username) {
            response.sendRedirect("/login");
            return false;
        }
        return super.preHandle(request, response, handler);
    }
}
