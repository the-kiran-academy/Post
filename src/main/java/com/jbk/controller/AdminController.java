package com.jbk.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entity.User;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@GetMapping("/get-all-posts")
	public List<User> getAllUser(){
		return null;
		
	}
	@DeleteMapping("/delete-user/{username}")
	public String deleteUser(@PathVariable String username) {
		return null;
		
	}
	@PostMapping("/update-user")
	public String updateUser(@RequestBody User user) {
		return null;
		
	}
	@GetMapping("/approve-request/{value}")
	public boolean approvePost(@PathVariable boolean value) {
		return false;
		
	}
	@DeleteMapping("/delete-post/{postId}")
	public String deletePost(@PathVariable long postId) {
		return null;
		
	}
}
