package com.telusko.joblisting.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.telusko.joblisting.model.Post;
@Repository
public interface SearchRepository {
	
	public List<Post> findByText(String text);
	
}
