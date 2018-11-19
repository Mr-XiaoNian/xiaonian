package com.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.session.SessionConfig;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author lei.jia@insentek.com
 * @date 2018/11/14
 * 修正历史：
 * 	2018/11/14：文件创建
 */
@RestController
@RequestMapping(value = "session/config")
public class demoController {
    
    static int i = 0;
    
    //获取完整session
    @RequestMapping(value = "get")
    public String getSession(HttpServletRequest request) {
        JSONObject content = SessionConfig.getSession(request);
        if (content != null) {
            JSONObject result = new JSONObject();
            result.put("token", request.getHeader("token"));
            result.put("session", content);
            return result.toJSONString();
        }
        return null;
    }
    
    
    //给session存储某key，value
    @RequestMapping(value = "set")
    public void setSession(HttpServletRequest request) {
        SessionConfig.setSessionValue(request, request.getParameter("key"), String.valueOf(i));
        i++;
    }
    
    //删除session
    @RequestMapping(value = "remove")
    public void removeSessions(HttpServletRequest request) {
        SessionConfig.removeSession(request);
    }
    
    //获取session的某值
    @RequestMapping(value = "get/value")
    public String getSessionValue(HttpServletRequest request) {
        return SessionConfig.getSessionValue(request, request.getParameter("key"));
    }
    
    //删除session的某值
    @RequestMapping(value = "remove/value")
    public void removeSessionValue(HttpServletRequest request) {
        SessionConfig.removeSessionValue(request, request.getParameter("key"));
    }
    
}
