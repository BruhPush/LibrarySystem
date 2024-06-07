package com.example.controller;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    //新增和修改
    @PostMapping
    public Integer save(@RequestBody User user){

        return userService.save(user);
    }
    //删除
    @DeleteMapping("/{id}")
    public Integer delete(@PathVariable Integer id){
        return userMapper.deletebyid(id);
    }
    //查询所有数据
    @GetMapping
    public List<User> findAll(){
        return userMapper.findAll();
    }
    //分页查询
    @GetMapping("/page")
    public Map<String, Object> findPage(@RequestParam Integer pageNum, @RequestParam Integer pageSize){
        pageNum = (pageNum - 1) * pageSize;
        List<User> data = userMapper.selectPage(pageNum,pageSize);
        Integer total = userMapper.selectTotal();
        Map<String,Object> res = new HashMap<>();
        res.put("data",data);
        res.put("total",total);
        return res;
    }
}
