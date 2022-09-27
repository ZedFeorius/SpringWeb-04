package com.zedfeorius.springweb04.mapper;

import com.zedfeorius.springweb04.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ZedFeorius
 * @version 1.0.0
 * @date 09 27 2022  14:02:19
 * @packageName com.zedfeorius.springweb04.mapper
 * @className UserMapper
 * @describe TODO
 */
@Repository
@Mapper
public interface UserMapper {
    List<User> getUserList();
}
