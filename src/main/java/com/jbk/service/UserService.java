package com.jbk.service;

import java.sql.Date;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.jbk.entity.Role;
import com.jbk.entity.User;
import com.jbk.security.CustomUserDetail;


@Transactional
public interface UserService {
	CustomUserDetail loadUserByUserId(String userId);

	boolean addUser(User user);

	User loginUser(User user);

	boolean deleteUserById(String id);

	User getUserById(String id);

	List<User> getAllUsers();

	User updateUser(User user);

	List<User> getUserByFirstName(String firstName);

	Role addRole(Role role);

	public Role getRoleById(int roleId);
	
	
	

}
