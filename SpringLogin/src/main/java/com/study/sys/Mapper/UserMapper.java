package com.study.sys.Mapper;

import java.util.List;

import com.study.sys.Entity.UserEntity;

public interface UserMapper {

    List<UserEntity> userList();

    UserEntity user();

    void addUser(UserEntity user);
}