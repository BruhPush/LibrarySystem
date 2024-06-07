package com.example.entity;

import lombok.Data;


@Data
public class User {
    private Integer id;
    private String name;
    private String password;
    private String sex;
    private Integer age;
    private String phone;

}