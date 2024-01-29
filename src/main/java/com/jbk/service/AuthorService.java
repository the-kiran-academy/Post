package com.jbk.service;

import java.util.List;

import com.jbk.entity.Post;

public interface AuthorService {

	public int createPost(Post post);
	public List<Post> getMinePost(String username);
}
