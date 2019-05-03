package com.example.demo.services.impl;

import com.example.demo.dao.ArticleMapper;
import com.example.demo.entity.Article;
import com.example.demo.services.NewsService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    ArticleMapper articleMapper;

    @Override
    public List<Article> list(Integer page_start, Integer page_num) {
        PageHelper.startPage(page_start, page_num);
        List<Article> articles = articleMapper.selectAll();
        return articles;
    }
}
