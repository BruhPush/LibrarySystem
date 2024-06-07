package com.example.mapper;

import com.example.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper

public interface UserMapper {
    @Select("select * from user")
    List<User> findAll();

    @Insert("INSERT into user(name,password,sex,age,phone) " +
            "VALUES(#{name},#{password},#{sex},#{age},#{phone})")
    int insert(User user);

    int update(User user);

    @Delete("delete from user where id = #{id}")
    int deletebyid(@Param("id") Integer id);

    @Select("select * from user limit #{pageNum},#{pageSize}")
    List<User> selectPage(Integer pageNum, Integer pageSize);

    @Select("select count(*) from user")
    Integer selectTotal();
}
