package com.jbk.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entity.Post;

@RestController
@RequestMapping("/author")
public class AuthorController {
	
	@PostMapping("/create-post")
	public int createPost(@RequestBody Post post) {
		return 0;
		
	}
	@GetMapping("/get-mine-post/{username}")
	public List<Post> getMinePost(@PathVariable String username){
		System.out.println("done");
		return new ArrayList<Post>();
		
	}
	
	@GetMapping("/hi")
	public String msg() {
		return "hi";
	}
}
