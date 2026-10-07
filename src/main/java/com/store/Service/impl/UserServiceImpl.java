package com.store.Service.impl;

import com.store.Mapper.UserMapper;
import com.store.Service.UserService;
import com.store.domain.po.User;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User getUserById(Long id) {
        return userMapper.getById(id);
    }
}