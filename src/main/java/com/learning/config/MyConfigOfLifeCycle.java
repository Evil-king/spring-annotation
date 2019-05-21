package com.learning.config;

import com.learning.bean.Car;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author hwq
 * @date 2019/05/20
 */
@ComponentScan("com.learning.bean")
@Configuration
public class MyConfigOfLifeCycle {

    @Bean(initMethod = "init",destroyMethod = "destory")
    public Car car(){
        return new Car();
    }
}
