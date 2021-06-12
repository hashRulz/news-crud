package com.newspaper.newswebsite.service;

import com.newspaper.newswebsite.domain.News;
import com.newspaper.newswebsite.repository.CategoryRepository;
import com.newspaper.newswebsite.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class NewsServiceImpl implements NewsService{


    @Autowired
    private NewsRepository newsRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    @Transactional
    public void addNews(News news) {
       // System.out.println(news);
        newsRepository.save(news);

    }

    @Override
    public List<News> getAllNews() {
        return newsRepository.findAll();
    }

    @Override
    public News getNewsById(long id) {
        return newsRepository.getById(id);
    }
}
