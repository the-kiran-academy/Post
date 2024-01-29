package com.jbk.service;

import java.util.List;

import com.jbk.entity.User;

public interface AdminService {
	
	public List<User> getAllUser();
	public int deleteUser(String username);
	public int updateUser(User user);
	public boolean approvePost();
	public int deletePost(long postId);

}
