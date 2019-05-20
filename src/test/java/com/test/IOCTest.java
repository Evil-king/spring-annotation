package com.test;

import com.learning.config.MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class IOCTest {

    @SuppressWarnings("resource")
    @Test
    public void test01(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] definitionNames = context.getBeanDefinitionNames();
        for(String name : definitionNames){
            System.out.println(name);
        }
    }
}
