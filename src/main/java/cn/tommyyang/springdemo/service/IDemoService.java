package cn.tommyyang.springdemo.service;

import cn.tommyyang.springdemo.model.Demo;

import java.util.List;
import java.util.Set;

/**
 * @Author: tingzai.yang@gmail.com
 * @Time: 2019/11/1 7:27 PM
 * @Software: IntelliJ IDEA
 */
public interface IDemoService {

    List<Demo> selectDemos(List<Integer> ids);

    Integer del(Set<Integer> ids);

    Integer update(Set<Integer> ids);

}
