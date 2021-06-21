package com.code.fuqinqin.springcachedemo.service;

import lombok.extern.slf4j.Slf4j;
import org.badger.support.spring.log.annotation.BadgerLogAspect;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ValidationTestServiceImpl implements IValidationTestService {
    @Override
    public String validate(String data) {
        try {
            Thread.sleep(2540L);
        } catch (InterruptedException e) {
            log.error("Error: ", e);
        }
        return "service - " + data;
    }

    @Override
    @BadgerLogAspect(ignorePrint = true)
    public void voidValidate(String data) {
        log.info("void data = {}", data);
    }
}
