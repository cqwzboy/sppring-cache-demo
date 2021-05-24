package com.code.fuqinqin.springcachedemo.service;

import com.code.fuqinqin.springcachedemo.annotation.PersonCacheEvict;
import com.code.fuqinqin.springcachedemo.annotation.PersonCacheable;
import com.code.fuqinqin.springcachedemo.model.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author fuqinqin
 * @date 2021-05-24
 * */
@Slf4j
@Service
public class PersonServiceImpl implements IPersonService {
    private AtomicInteger id = new AtomicInteger(0);

    @Override
    @CachePut(value = "Person", key = "#person.id", condition = "#person.id % 2 == 0")
    public Person add(Person person) {
        log.info("保存数据，person = {}", person);
        person.setId(id.addAndGet(1));
        return person;
    }

    @Override
    @CacheEvict(value = "Person")
    public void update(Person person) {
        log.info("修改数据，person = {}", person);
    }

    @Override
    @PersonCacheEvict
    public void delete(Integer id) {
        log.info("删除数据，id = {}", id);
    }

    @Override
    @PersonCacheable
    public Person getById(Integer id) {
        log.info("查询数据，id = {}", id);
        return Person.build(id);
    }
}
