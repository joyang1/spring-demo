package cn.tommyyang.springdemo.interceptor.impl;

import cn.tommyyang.springdemo.annotation.Log;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * @Author: TommyYang
 * @Time: 2019/12/4 9:47 AM
 * @Software: IntelliJ IDEA
 */
@Component
public class LogInterceptor implements HandlerInterceptor {

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        try {
            if (handler instanceof HandlerMethod) {
                Integer aa = Integer.parseInt(request.getAttribute("id").toString());
                Method m = ((HandlerMethod)handler).getMethod();
                Log log = m.getAnnotation(Log.class);
                if (log == null) {
                    return;
                }
                System.out.println(aa);
                System.out.println(log.content());
                System.out.println(log.type());
                System.out.println("log end");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }

    }
}
