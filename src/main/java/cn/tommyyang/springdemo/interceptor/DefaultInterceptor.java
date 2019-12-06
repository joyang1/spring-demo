package cn.tommyyang.springdemo.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: TommyYang
 * @Time: 2019/12/4 9:41 AM
 * @Software: IntelliJ IDEA
 */
public interface DefaultInterceptor {

    void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception;

}
