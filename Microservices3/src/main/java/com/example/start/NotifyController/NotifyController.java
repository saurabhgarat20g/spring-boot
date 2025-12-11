package com.example.start.NotifyController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.start.entity.Notification;


@RestController
public class NotifyController {
   @GetMapping("/noti/{nid}")
public  Notification getnotifybyid(@PathVariable ("nid") int id) {
	   
	   Notification noti = new Notification(id,"alert notifycation boys"+id);
	   return noti;
   }


}
