package cn.tommyyang.springdemo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: TommyYang
 * @Time: 2019/12/4 9:45 AM
 * @Software: IntelliJ IDEA
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Log {

    String content() default "";

    int type() default 0;

}
