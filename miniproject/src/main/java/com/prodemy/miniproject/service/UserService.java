package com.prodemy.miniproject.service;

import com.prodemy.miniproject.dto.UserDto;
import com.prodemy.miniproject.model.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);
    User findUserByEmail(String email);
    List<UserDto> findAllUsers();
}
