package com.jbk.service.impl;

import java.sql.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.jbk.dao.UserDao;
import com.jbk.entity.Role;
import com.jbk.entity.User;
import com.jbk.security.CustomUserDetail;
import com.jbk.service.UserService;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	public BCryptPasswordEncoder passwordEncoder;

	@Autowired
	private UserDao dao;

	@Override
	public boolean addUser(User user) {
		
		return false;

	}

	@Override  // required for security
	public User loginUser(User user) {

		return dao.loginUser(user);
	}

	@Override  // required for security
	public CustomUserDetail loadUserByUserId(String userId) {
		return dao.loadUserByUserId(userId);
	}

	@Override
	public boolean deleteUserById(String id) {
		return dao.deleteUserById(id);
	}

	@Override
	public User getUserById(String id) {
		User user = dao.getUserById(id);
		return user;
	}

	@Override
	public List<User> getAllUsers() {

		return null;

	}

	@Override
	public User updateUser(User user) {
		return null;

	}

	

	@Override
	public List<User> getUserByFirstName(String firstName) {
		return dao.getUserByFirstName(firstName);
	}

	@Override
	public Role addRole(Role role) {

		return null;

	}

	@Override
	public Role getRoleById(int roleId) {

		return dao.getRoleById(roleId);
	}

}
