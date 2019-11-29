package cn.tommyyang.springdemo.dao;

import cn.tommyyang.springdemo.model.Data1;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: tingzai.yang@gmail.com
 * @Time: 2019/11/21 7:10 PM
 * @Software: IntelliJ IDEA
 */
public interface IData1Dao {

    Integer batchInsert(List<Data1> data1List);

    Integer update(@Param("rid") Integer rid, @Param("status") Integer status);

}
