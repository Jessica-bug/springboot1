package com.jessica.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;

import java.lang.reflect.Method;


/**
 * Created by guanyiting on 2018/7/27 0027.
 * desc:
 */
@Configuration
@EnableCaching
public class RedisConfig extends CachingConfigurerSupport {
    @Bean
    public KeyGenerator keyGenerator(){
        return new KeyGenerator(){
            @Override
            public Object generate(Object target, Method method, Object... params) {
                StringBuilder sb=new StringBuilder();
                sb.append(target.getClass().getName());
                sb.append(method.getName());
                for(Object o:params){
                    sb.append(o.toString());
                }
                return sb.toString();
            }
        };
    }

    /*@SuppressWarnings("rawtypes")
    @Bean
    public CacheManager cacheManager(RedisTemplate redisTemplate){
//        new RedisCacheManager(redisTemplate)
        return null;
    }*/
}
