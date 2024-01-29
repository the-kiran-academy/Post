package com.jbk.service;

import com.jbk.entity.Post;

public interface ReaderService {

	public Post searchPosrByAuthor(String authorName);
	public boolean commentOnPost();
}
