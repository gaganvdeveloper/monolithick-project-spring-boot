package com.telusko.joblisting.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.telusko.joblisting.model.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
