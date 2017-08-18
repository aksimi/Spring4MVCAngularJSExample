package com.anuj.springmvc.service;

import java.util.List;

import com.anuj.springmvc.model.User;

/**
 * @author Anuj singh
 * @Date 14/08/2017
 *
 */

public interface UserService {
	
	User findById(long id);
	
	User findByName(String name);
	
	void saveUser(User user);
	
	void updateUser(User user);
	
	void deleteUserById(long id);

	List<User> findAllUsers(); 
	
	void deleteAllUsers();
	
	public boolean isUserExist(User user);
	
}
