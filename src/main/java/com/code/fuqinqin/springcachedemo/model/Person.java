package com.code.fuqinqin.springcachedemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author fuqinqin
 * @date 2021-05-24
 */
@Data
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private Integer id;
    private String name;
    private Integer age;
    private String address;

    public static Person build(Integer id) {
        log.info("构建Person，id = {}", id);
        return new Person(id, "name_" + id, id, "address_" + id);
    }
}
