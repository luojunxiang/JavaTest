package com.springboot.dxctest.buis.redis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import com.springboot.dxctest.buis.redis.serializer.JsonRedisSerializer;

import javax.annotation.Resource;

/**
 * Redis配置
 *
 * @author zong-bo.liu@dxc.com
 */
@Configuration
public class RedisConfig {
    @Resource
    private RedisConnectionFactory factory;

    @Bean
    public RedisTemplate<String, Object> redisTemplate() {
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new JsonRedisSerializer<>(Object.class));
        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
        redisTemplate.setHashValueSerializer(new JsonRedisSerializer<>(Object.class));
        redisTemplate.setConnectionFactory(factory);

        return redisTemplate;
    }
}