package com.zedfeorius.springweb04.service;

import com.zedfeorius.springweb04.entity.User;

import java.util.List;

/**
 * @author ZedFeorius
 * @version 1.0.0
 * @date 09 27 2022  14:04:07
 * @packageName com.zedfeorius.springweb04.service
 * @className UserService
 * @describe TODO
 */
public interface UserService {

    List<User> getUserList();
}
