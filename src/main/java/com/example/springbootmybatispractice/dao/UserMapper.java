package com.example.springbootmybatispractice.dao;

import com.example.springbootmybatispractice.model.UserDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    List<UserDto> getList();
}
