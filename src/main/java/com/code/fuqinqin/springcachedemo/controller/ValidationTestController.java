package com.code.fuqinqin.springcachedemo.controller;

import com.alibaba.fastjson.JSON;
import com.code.fuqinqin.springcachedemo.model.ValidationTestRequest;
import com.code.fuqinqin.springcachedemo.service.IValidationTestService;
import org.badger.support.spring.validation.annotation.BadgerValid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/validation")
public class ValidationTestController {
    @Autowired
    private IValidationTestService validationTestService;

    @PostMapping("/test")
    public String test(@BadgerValid @RequestBody ValidationTestRequest request) {
        String data = JSON.toJSONString(request);
        validationTestService.voidValidate(data);
        return validationTestService.validate(data);
    }
}
