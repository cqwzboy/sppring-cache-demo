package com.code.fuqinqin.springcachedemo;

import org.badger.support.spring.log.annotation.EnableBadgerLogAspect;
import org.badger.support.spring.validation.annotation.EnableBadgerValidation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

@EnableCaching
@SpringBootApplication
@EnableBadgerValidation(pointcut = "execution(* com.code.fuqinqin.springcachedemo.controller..*(..))")
@EnableBadgerLogAspect(pointcut = "execution(* com.code.fuqinqin.springcachedemo..*(..))")
@ComponentScan(basePackages = {"com.code.fuqinqin", "org.badger.support.spring"})
public class SpringCacheDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCacheDemoApplication.class, args);
    }

}
