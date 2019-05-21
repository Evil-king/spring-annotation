package com.learning.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author hwq
 * @date 2019/05/20
 */
@Component
public class Dog {

    public Dog() {
        System.out.println("dog constructor......");
    }

    @PostConstruct
    public void init(){
        System.out.println("dog PostConstruct.....");
    }

    @PreDestroy
    public void destory(){
        System.out.println("dog PreDestroy......");
    }
}
