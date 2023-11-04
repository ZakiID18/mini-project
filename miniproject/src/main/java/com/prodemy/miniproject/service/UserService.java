package com.prodemy.miniproject.service;

<<<<<<< HEAD
import java.util.List;

import com.prodemy.miniproject.dto.UserDto;
import com.prodemy.miniproject.model.User;

public interface UserService {
	
	void saveUser(UserDto userDto);
	User findUserByEmail(String email);
	List<UserDto> findAllUsers();
=======
import com.prodemy.miniproject.dto.UserDto;
import com.prodemy.miniproject.model.User;
>>>>>>> branch 'master' of https://github.com/ZakiID18/mini-project.git

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);
    User findUserByEmail(String email);
    List<UserDto> findAllUsers();
}
