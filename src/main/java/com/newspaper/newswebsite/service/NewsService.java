package com.newspaper.newswebsite.service;

import com.newspaper.newswebsite.domain.News;
import org.springframework.stereotype.Service;

import java.util.List;


public interface NewsService {
     void addNews(News news);
     List<News> getAllNews();
     News getNewsById(long id);
}
