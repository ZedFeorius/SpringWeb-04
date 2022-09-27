package com.zedfeorius.springweb04.service;

import com.zedfeorius.springweb04.entity.User;
import com.zedfeorius.springweb04.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZedFeorius
 * @version 1.0.0
 * @date 09 27 2022  14:04:26
 * @packageName com.zedfeorius.springweb04.service
 * @className UserServiceImpl
 * @describe TODO
 */
@Service("UserService")
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }
}
