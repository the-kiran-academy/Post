package com.jbk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entity.Comment;
import com.jbk.entity.Post;

@RestController
@RequestMapping("/reader")
public class ReaderController {

	@GetMapping("/search-by-author-name/{authorName}")
	public Post searchPostByAuthor(String authorName) {
		return null;
		
	}
	
	@PostMapping("/comment-on-post")
	public boolean commentOnPost(@RequestBody Comment comment) {
		return false;
	}
}
