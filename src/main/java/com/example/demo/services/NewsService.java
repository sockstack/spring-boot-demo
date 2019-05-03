package com.example.demo.services;

import com.example.demo.entity.Article;

import java.util.List;

public interface NewsService {
    List<Article> list(Integer page_start, Integer page_num);
}
