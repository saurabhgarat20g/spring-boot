package com.example.start.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.start.entity.Posts;
@RestController
public class PostController {
	
	@GetMapping("/posts/{id}")
	public Posts getPostById(@PathVariable int id) {
		Posts post = new Posts(id , "whos cares "+ id);
		return post;
	}

}
