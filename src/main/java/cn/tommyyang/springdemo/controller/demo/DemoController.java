package cn.tommyyang.springdemo.controller.demo;

import cn.tommyyang.springdemo.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: tingzai.yang@gmail.com
 * @Time: 2019/11/1 7:24 PM
 * @Software: IntelliJ IDEA
 */
@Controller
@RequestMapping("demo")
public class DemoController {

    @Autowired
    private IDemoService demoService;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String get(@RequestParam(value = "id") Integer id) {
        List<Integer> ids = new ArrayList<>();
        ids.add(id);
        ids.add(2);
        demoService.selectDemos(ids).forEach(System.out::println);
        return "success";
    }

    @RequestMapping(value = "/del", method = RequestMethod.DELETE)
    @ResponseBody
    public String del(@RequestParam(value = "id") Integer id) {
        Set<Integer> ids = new HashSet<>();
        ids.add(id);
        ids.add(2);
        System.out.println(demoService.del(ids));
        return "success";
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    @ResponseBody
    public String update(@RequestParam(value = "id") Integer id) {
        Set<Integer> ids = new HashSet<>();
        ids.add(id);
        ids.add(2);
        System.out.println(demoService.update(ids));
        return "success";
    }

}
