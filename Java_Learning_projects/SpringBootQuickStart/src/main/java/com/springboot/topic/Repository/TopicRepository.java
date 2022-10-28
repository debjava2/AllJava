package com.springboot.topic.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.Models.Topics;

@Repository
public interface TopicRepository extends CrudRepository<Topics, Integer>{

}
