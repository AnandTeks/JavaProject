package com.example.teks.controller.Topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	Repo repo;
	@RequestMapping
	public  List<Topic> getAllTopic() {
		return Arrays.asList(new Topic("One","Anand","Mohan"),
							 new Topic("Two","Ajith","Mohan"),
							 new Topic("Three","Santhi","Mohan"));
	}

}
