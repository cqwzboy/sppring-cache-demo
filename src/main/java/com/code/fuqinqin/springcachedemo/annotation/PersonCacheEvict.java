package com.code.fuqinqin.springcachedemo.annotation;

import org.springframework.cache.annotation.CacheEvict;

import java.lang.annotation.*;

/**
 * @author fuqinqin
 * @date 2021-05-24
 * */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@CacheEvict(value = "Person")
public @interface PersonCacheEvict {
}
