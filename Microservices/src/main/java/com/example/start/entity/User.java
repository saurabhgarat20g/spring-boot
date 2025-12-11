package com.example.start.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	
	private int id;
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	private String name;
	
	private Posts post;
	private Notification noti;

}
