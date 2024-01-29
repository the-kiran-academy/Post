package com.jbk.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jbk.entity.User;
import com.jbk.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean approvePost() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int deletePost(long postId) {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public int deleteUser(String username) {
		// TODO Auto-generated method stub
		return 0;
	}

}
