package cn.tommyyang.springdemo.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Author: TommyYang
 * @Time: 2019/12/13 1:01 PM
 * @Software: IntelliJ IDEA
 */
public class LogFilter implements Filter {

    private static int counter = 0;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest)servletRequest;
        if (servletRequest.getAttribute("aa") != null) {
            System.out.println("yes");
        }

        filterChain.doFilter(servletRequest, servletResponse);

        System.out.println("access filter time:" + counter);
    }

    @Override
    public void destroy() {

    }
}
