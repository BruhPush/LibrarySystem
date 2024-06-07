package com.example;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
@MapperScan("com.example.mapper")
public class SpringbootApplication {

    @Autowired
    private UserMapper userMapper;
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }



    @GetMapping("/")
    public List<User> index(){
        return userMapper.findAll();


    }


}
