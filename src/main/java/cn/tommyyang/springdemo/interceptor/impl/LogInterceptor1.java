package cn.tommyyang.springdemo.interceptor.impl;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Writer;

/**
 * @Author: TommyYang
 * @Time: 2019/12/13 3:37 PM
 * @Software: IntelliJ IDEA
 */
public class LogInterceptor1 implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        response.setContentType("application/json;charset=UTF-8");
        try(Writer writer = response.getWriter()) {
            JSONObject json = new JSONObject();
            json.put("code", 500);
            json.put("msg", "error");
            writer.write(json.toString());
        }
        return false;
    }
}
