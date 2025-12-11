package com.example.start.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.start.entity.Notification;
import com.example.start.entity.Posts;
import com.example.start.entity.User;

@RestController

public class usercontroller {
	@Autowired
	private RestTemplate resttemplate;

	@GetMapping("/user/{id}")
	public User getUser(@PathVariable int id) {
		
		User user = new User(id ,"user object is been initiated with id " );
		
		//posts
		Posts post = resttemplate.getForObject("http://localhost:9090/posts/1", Posts.class);
				user.setPost(post);
		
		
		//notification
	    Notification noti = resttemplate.getForObject("http://localhost:7070/noti/4",Notification.class);
	    user.setNoti(noti);
		return user;
	}

	
}
