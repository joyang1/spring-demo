package cn.tommyyang.test.service;

import cn.tommyyang.springdemo.model.Demo;
import cn.tommyyang.springdemo.service.IDemoService;
import cn.tommyyang.test.BaseTest;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: tingzai.yang@gmail.com
 * @Time: 2019/11/6 10:09 AM
 * @Software: IntelliJ IDEA
 */
public class DemoServiceImplTest extends BaseTest {

    @Resource
    private IDemoService demoService;

    @Test
    public void testDel(){
        Set<Integer> ids = new HashSet<>();
        demoService.del(ids);
    }

    @Test
    public void testGet(){
        List<Integer> ids = new ArrayList<>();
        ids.add(2);
        List<Demo> demos = demoService.selectDemos(ids);
        System.out.println(demos.size());
    }
}
