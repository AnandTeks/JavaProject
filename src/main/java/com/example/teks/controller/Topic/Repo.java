package com.example.teks.controller.Topic;

import org.springframework.data.repository.CrudRepository;
import java.lang.String;
import com.example.teks.controller.Topic.Topic;
import java.util.List;


public interface Repo extends CrudRepository<Topic,Long>{
		List<Topic> findById(String id);
		 public List<Topic> findByAgeLessThanEqual (long age);
		
}
