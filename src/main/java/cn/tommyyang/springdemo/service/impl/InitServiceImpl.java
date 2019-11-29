package cn.tommyyang.springdemo.service.impl;

import cn.tommyyang.springdemo.service.IInitService;
import org.springframework.stereotype.Service;

/**
 * @Author: tingzai.yang@gmail.com
 * @Time: 2019/10/21 11:59 AM
 * @Software: IntelliJ IDEA
 */
@Service("initServiceImpl")
public class InitServiceImpl implements IInitService {
    @Override
    public void test() {
        System.out.println("test init service impl");
    }
}
