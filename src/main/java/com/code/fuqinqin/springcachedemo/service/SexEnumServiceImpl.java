package com.code.fuqinqin.springcachedemo.service;

import com.code.fuqinqin.springcachedemo.enums.SexEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author fuqinqin
 * @date 2021-05-24
 * */
@Slf4j
@Service
public class SexEnumServiceImpl implements ISexEnumService {
    @Override
    @Cacheable(value = "Sex")
    public List<String> names() {
        log.info("获取性别枚举名称集合");
        return Stream.of(SexEnum.values())
                .map(SexEnum::name)
                .collect(Collectors.toList());
    }
}
