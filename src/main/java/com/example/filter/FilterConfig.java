package com.example.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisPassword;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceClientConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.web.filter.DelegatingFilterProxy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lei.jia@insentek.com
 * @date 2018/11/15
 * 修正历史：
 * 	2018/11/15：文件创建
 */

@EnableRedisHttpSession
public class FilterConfig {
    
    //redis连接池配置
    @Bean
    public LettuceConnectionFactory connectionFactory() {
    
        // RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration();
        // redisStandaloneConfiguration.setDatabase(192668);
        // redisStandaloneConfiguration.setHostName("127.0.0.1");
        // redisStandaloneConfiguration.setPort(6379);
        // redisStandaloneConfiguration.setPassword(RedisPassword.of("1231649"));
        //
        // LettuceClientConfiguration.LettuceClientConfigurationBuilder lettuceClientConfigurationBuilder = LettuceClientConfiguration.builder();
        // LettuceConnectionFactory factory = new LettuceConnectionFactory(redisStandaloneConfiguration,
        //         lettuceClientConfigurationBuilder.build());
        // return factory;
        //
        
        return new LettuceConnectionFactory();
    }
    
}
