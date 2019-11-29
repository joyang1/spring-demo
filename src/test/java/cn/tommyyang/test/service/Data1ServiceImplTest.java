package cn.tommyyang.test.service;

import cn.tommyyang.springdemo.model.Data1;
import cn.tommyyang.springdemo.service.IData1Service;
import cn.tommyyang.test.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @Author: tingzai.yang@gmail.com
 * @Time: 2019/11/21 7:25 PM
 * @Software: IntelliJ IDEA
 */
public class Data1ServiceImplTest extends BaseTest {

    @Autowired
    private IData1Service data1Service;

    @Test
    public void testBatchInsert() {
        List<Data1> data1List = new ArrayList<>(10000);
        generateData(data1List);
        Integer res = data1Service.batchInsert(data1List);
        System.out.println(res);
    }

    private void generateData(List<Data1> data1List) {
        for (int i = 10000; i < 30000; i++){
            Data1 data1 = new Data1(i, "name" + i, "type" + i % 100);
            data1List.add(data1);
        }
    }

    @Test
    public void testUpdate() {
        IntStream.range(100, 120).forEach(index -> {
            new Thread(()->{
                System.out.println("update:" + index + ":" + data1Service.update((index - 100) % 2, (index - 100) % 2));
            }).start();
        });

        while(Thread.activeCount() > 3) {
            Thread.yield();
        }
        System.out.println("finished");
    }
}
