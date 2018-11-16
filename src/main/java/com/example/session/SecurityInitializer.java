package com.example.session;

import com.example.filter.FilterConfig;
import org.apache.catalina.security.SecurityConfig;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * @author lei.jia@insentek.com
 * @date 2018/11/16
 * 修正历史：
 * 	2018/11/16：文件创建
 */


//与springsecurity整合配置
public class SecurityInitializer extends AbstractSecurityWebApplicationInitializer {
    
    public SecurityInitializer() {
        super(SecurityConfig.class, FilterConfig.class);
    }
}