package com.example.demo.config;

import com.example.demo.handler.LoginHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandler()).addPathPatterns("/*").excludePathPatterns("/login")
                .excludePathPatterns("/doLogin");
        super.addInterceptors(registry);
    }
}
