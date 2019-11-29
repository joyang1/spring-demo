package cn.tommyyang.springdemo.service;

import cn.tommyyang.springdemo.model.Data1;

import java.util.List;

/**
 * @Author: tingzai.yang@gmail.com
 * @Time: 2019/11/21 7:21 PM
 * @Software: IntelliJ IDEA
 */
public interface IData1Service {

    Integer batchInsert(List<Data1> data1List);

    Integer update(Integer rid, Integer status);

}
