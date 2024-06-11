package com.redis.redis.controller;

import com.redis.redis.model.RedisData;
import com.redis.redis.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RedisController {
    @Autowired
    private RedisService redisService;
    @GetMapping("/get/{key}")
    public String get(@PathVariable String key)
    {
        return redisService.get(key);
    }
    @PostMapping("/set")
    public void set(@RequestBody RedisData data)
    {
        redisService.set(data.getKey(), data.getValue());
    }
}
