package com.demo.in.service;

import com.demo.in.dto.UserDto;
import com.demo.in.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();

}
