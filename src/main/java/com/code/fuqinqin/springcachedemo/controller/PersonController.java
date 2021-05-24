package com.code.fuqinqin.springcachedemo.controller;

import com.code.fuqinqin.springcachedemo.model.Person;
import com.code.fuqinqin.springcachedemo.service.IPersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author fuqinqin
 * @date 2021-05-24
 */
@Slf4j
@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private IPersonService personService;

    @PostMapping("")
    public String add() {
        Person person = new Person();
        person.setName("张三");
        person.setAge(100);
        person.setAddress("重庆");
        personService.add(person);
        return "success";
    }

    @PutMapping("/{id}")
    public String update(@PathVariable("id") Integer id) {
        personService.update(Person.build(id));
        return "success";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Integer id) {
        personService.delete(id);
        return "success";
    }

    @GetMapping("/{id}")
    public Person getById(@PathVariable("id") Integer id) {
        return personService.getById(id);
    }
}
