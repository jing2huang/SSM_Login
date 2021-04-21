package com.study.sys.Mapper;

import java.util.List;
import java.util.Map;

import com.study.sys.Entity.UserEntity;

public interface UserMapper {

    List<Map<String, Object>> userList();

    UserEntity user();

    void addUser(UserEntity user);
}