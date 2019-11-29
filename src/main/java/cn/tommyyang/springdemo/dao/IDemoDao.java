package cn.tommyyang.springdemo.dao;

import cn.tommyyang.springdemo.model.Demo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author: tingzai.yang@gmail.com
 * @Time: 2019/11/1 7:12 PM
 * @Software: IntelliJ IDEA
 */
public interface IDemoDao {

    List<Demo> selectDemos(Map<String, Object> params);

    Integer del(Map<String, Object> params);

    Integer update(@Param("ids") Set<Integer> ids);

}
