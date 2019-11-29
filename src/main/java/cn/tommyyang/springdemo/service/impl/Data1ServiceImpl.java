package cn.tommyyang.springdemo.service.impl;

import cn.tommyyang.springdemo.dao.IData1Dao;
import cn.tommyyang.springdemo.model.Data1;
import cn.tommyyang.springdemo.service.IData1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: tingzai.yang@gmail.com
 * @Time: 2019/11/21 7:22 PM
 * @Software: IntelliJ IDEA
 */
@Service
public class Data1ServiceImpl implements IData1Service {

    @Autowired
    private IData1Dao data1Dao;

    @Override
    public Integer batchInsert(List<Data1> data1List) {
        return data1Dao.batchInsert(data1List);
    }

    @Override
    public Integer update(Integer rid, Integer status) {
        return data1Dao.update(rid, status);
    }
}
