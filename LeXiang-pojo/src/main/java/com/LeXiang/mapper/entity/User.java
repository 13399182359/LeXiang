package com.LeXiang.mapper.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author 张俊荣 15835910851
 * @Description //TODO
 * @Date 2019/9/16 9:30
 * @Param
 * @return
 **/
@Data
public class User implements Serializable {
    private Integer id;

    private String name;

    private Integer age;


}
