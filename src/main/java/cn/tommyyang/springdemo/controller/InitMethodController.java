package cn.tommyyang.springdemo.controller;

import cn.tommyyang.springdemo.BaseController;
import cn.tommyyang.springdemo.annotation.Log;
import cn.tommyyang.springdemo.service.IInitService;
import cn.tommyyang.springdemo.service.impl.InitServiceImpl;
import cn.tommyyang.springdemo.service.impl.InitServiceImpl2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

/**
 * @Author: tingzai.yang@gmail.com
 * @Time: 2019/10/21 11:50 AM
 * @Software: IntelliJ IDEA
 */
@Controller
@RequestMapping("initTest")
public class InitMethodController extends BaseController {

    @Resource(name = "map")
    private HashMap<Class, IInitService> hMap;

    @RequestMapping(value = "/init-map.do", method = RequestMethod.GET)
    @Log(type = 1, content = "aaaa")
    public String manage(HttpServletRequest request, HttpServletResponse response) {
        hMap.get(InitServiceImpl2.class).test();
        request.setAttribute("id", 111);
        return renderString(response, "wel");
    }

    public void sethMap(HashMap<Class, IInitService> hMap) {
        this.hMap = hMap;
    }
}
