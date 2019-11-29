package cn.tommyyang.springdemo.service.impl;

import cn.tommyyang.springdemo.dao.IDemoDao;
import cn.tommyyang.springdemo.model.Demo;
import cn.tommyyang.springdemo.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author: tingzai.yang@gmail.com
 * @Time: 2019/11/1 7:27 PM
 * @Software: IntelliJ IDEA
 */
@Service("demoService")
public class DemoServiceImpl implements IDemoService {

    @Autowired
    private IDemoDao demoDao;

    @Override
    public List<Demo> selectDemos(List<Integer> ids) {
        Map<String, Object> params = new HashMap<>();
        params.put("ids", ids);
        return demoDao.selectDemos(params);
    }

    @Override
    public Integer del(Set<Integer> ids) {
        Map<String, Object> params = new HashMap<>();
        params.put("ids", ids);
        return demoDao.del(params);
    }

    @Override
    public Integer update(Set<Integer> ids) {
        return demoDao.update(ids);
    }
}
