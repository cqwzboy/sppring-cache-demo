package com.code.fuqinqin.springcachedemo.model;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author fuqinqin
 * @date 2021-06-20
 * */
@Data
public class ValidationTestRequest implements Serializable {
    @NotNull(message = "id不能为空")
    @Min(value = 10, message = "id必须大于等于10")
    private Long id;
    @NotBlank(message = "name不能为空")
    private String name;
}
