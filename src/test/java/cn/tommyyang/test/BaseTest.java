package cn.tommyyang.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: tingzai.yang@gmail.com
 * @Time: 2019/11/6 10:09 AM
 * @Software: IntelliJ IDEA
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath*:application-*.xml"
})
public class BaseTest {

}
