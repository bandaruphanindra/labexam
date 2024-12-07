package com.klef.lab.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.lab.model.comment;
import com.klef.lab.service.commentservice;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class Commentcontroller {

    @Autowired
    private commentservice commentService;
    @GetMapping
    public ResponseEntity<List<comment>> fetchAllComments() {
        List<comment> comments = commentService.getAllComments();
        return ResponseEntity.ok(comments);
    }
}
