package com.code.fuqinqin.springcachedemo.controller;

import com.code.fuqinqin.springcachedemo.service.ISexEnumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author fuqinqin
 * @date 2021-05-24
 * */
@RestController
@RequestMapping("/sex")
public class SexEnumController {
    @Autowired
    private ISexEnumService sexEnumService;

    @GetMapping("/names")
    public List<String> names(){
        return sexEnumService.names();
    }
}
