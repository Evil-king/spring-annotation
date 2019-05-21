package com.test;

import com.learning.config.MyConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author hwq
 * @date 2019/05/20
 */
public class IOCTest_LifeCycle {

    @Test
    public void Test01(){
        //创建IOC容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfigOfLifeCycle.class);
        System.out.println("容器创建完成.....");

        //关闭容器
        context.close();
    }
}
