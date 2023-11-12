package com.gzc.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/11/10  16:40  周五
 * @Project: SpringCloud
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult <T> implements Serializable {

    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code,String message){
        this(code,message,null);//如果这行报错，请安装lombok插件
    }

}
