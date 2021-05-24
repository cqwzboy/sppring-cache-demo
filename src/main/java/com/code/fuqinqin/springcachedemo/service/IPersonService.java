package com.code.fuqinqin.springcachedemo.service;

import com.code.fuqinqin.springcachedemo.model.Person;

/**
 * @author fuqinqin
 * @date 2021-05-24
 * */
public interface IPersonService {
    /**
     * 新增
     *
     * @param person
     * @return Integer
     * */
    Person add(Person person);

    /**
     * 修改
     *
     * @param person
     * */
    void update(Person person);

    /**
     * 删除
     *
     * @param id
     * */
    void delete(Integer id);

    /**
     * 查询
     *
     * @param id
     * @return Person
     * */
    Person getById(Integer id);
}
