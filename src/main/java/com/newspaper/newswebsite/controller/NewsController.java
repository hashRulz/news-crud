package com.newspaper.newswebsite.controller;

import com.newspaper.newswebsite.domain.News;
import com.newspaper.newswebsite.service.CategoryService;
import com.newspaper.newswebsite.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/news")
public class NewsController {

    @Autowired
    private NewsService newsService;
    @Autowired
    private CategoryService categoryService;

    @PostMapping(path = "/addNews")
    public ResponseEntity<String> addNews(@RequestBody News news){
        try{
            newsService.addNews(news);
            return new ResponseEntity<String>("Successfully Added", HttpStatus.OK);
        }catch(Exception e){
            e.printStackTrace();
            return new ResponseEntity<String>(e.toString(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(path="/getNews")
    public ResponseEntity<List<News>> getAllUsers(){
        try{
            List<News> users = newsService.getAllNews();
            return new ResponseEntity<>(users,HttpStatus.OK);

        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping(path="/getNewsById/{id}")
    public ResponseEntity<News> getUserById(@PathVariable("id") long id){
        try{
            News news = newsService.getNewsById(id);
            return new ResponseEntity<News>(news ,HttpStatus.OK);

        }catch(Exception e){
            System.out.println(e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
