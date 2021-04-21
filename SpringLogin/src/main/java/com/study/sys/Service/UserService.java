package com.study.sys.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.study.sys.Entity.UserEntity;
import com.study.sys.Mapper.UserMapper;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void addUser(UserEntity user) {
        userMapper.addUser(user);
    }

    public List<Map<String, Object>> userList() {
        return userMapper.userList();
    }
}