package com.example.springbootmybatispractice.service;

import com.example.springbootmybatispractice.model.UserDto;

import java.util.List;

public interface UserService {
    public List<UserDto> getList();
}
