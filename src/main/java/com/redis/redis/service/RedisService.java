package com.redis.redis.service;

//import com.redis.redis.entity.MyObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisService {
    @Autowired
    private RedisTemplate<String, String> redisTemplate;


    public String get(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    public void set(String key, String value) {

        redisTemplate.opsForValue().set(key, value);
    }
}
