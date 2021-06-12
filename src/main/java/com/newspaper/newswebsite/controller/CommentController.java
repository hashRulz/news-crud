package com.newspaper.newswebsite.controller;

import com.newspaper.newswebsite.domain.Comment;
import com.newspaper.newswebsite.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/comment")
public class CommentController {

    @Autowired
    CommentService commentService;

    @PostMapping(path="/saveComment")
    public ResponseEntity<String> addComment(@RequestBody Comment comment){

        try{
            commentService.addComment(comment);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.toString(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
