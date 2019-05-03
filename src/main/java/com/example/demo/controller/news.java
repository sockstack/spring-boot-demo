package com.example.demo.controller;

import com.example.demo.entity.Article;
import com.example.demo.services.NewsService;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@Slf4j
@RequestMapping("/news")
public class news {
    @Autowired
    NewsService newsService;

    @GetMapping("/")
    public String newsList(ModelMap modelMap, @RequestParam(name = "page", defaultValue = "1") Integer page_start) {
        List<Article> list = newsService.list(page_start, 1);
        PageInfo<Article> articlePageInfo = new PageInfo<>(list);
        modelMap.addAttribute("articles", list);
        modelMap.addAttribute("links", articlePageInfo);
        return "admin/news_list";
    }

    @GetMapping("/add")
    public String newsAdd() {
        return "admin/news_add";
    }
}
