package com.jbk.service;

import com.jbk.entity.User;

public interface AuthService {

	public User loginUser(String usename,String password);
	
}
