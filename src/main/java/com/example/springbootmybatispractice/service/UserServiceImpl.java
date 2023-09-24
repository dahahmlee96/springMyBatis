package com.example.springbootmybatispractice.service;

import com.example.springbootmybatispractice.model.UserDto;
import lombok.RequiredArgsConstructor;
import com.example.springbootmybatispractice.dao.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper testMapper;

    @Override
    public List<UserDto> getList() {
        return testMapper.getList();
    }
}
