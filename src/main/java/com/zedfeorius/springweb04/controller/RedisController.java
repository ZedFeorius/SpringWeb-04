package com.zedfeorius.springweb04.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZedFeorius
 * @version 1.0.0
 * @date 09 27 2022  14:51:05
 * @packageName com.zedfeorius.springweb04.controller
 * @className RedisController
 * @describe TODO
 */
@RestController
@RequestMapping("/redis")
public class RedisController {
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @RequestMapping("/get/{key}")
    public Object get(@PathVariable String key){
        return redisTemplate.opsForValue().get(key);
    }

    @RequestMapping("/set/{key}/{value}")
    public Object set(@PathVariable String key,@PathVariable String value){
        redisTemplate.opsForValue().set(key, value);
        return "success";
    }
}
