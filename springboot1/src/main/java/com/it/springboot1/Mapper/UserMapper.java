package com.it.springboot1.Mapper;

import com.it.springboot1.pojo.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {
    @Insert("INSERT INTO users(username,age,gender,address,phone) VALUES (#{username},#{age},#{gender},#{address},#{phone})")
    void insertUser(User user);
    @Select("SELECT * FROM users WHERE username = #{username}")
    User getUserByUsername(String username);
    @Update("UPDATE users SET age=#{age},gender=#{gender},address=#{address},phone=#{phone} WHERE username=#{username}")
    void updateUser(User user);
    @Delete("DELETE FROM users WHERE username=#{username}")
    void deleteUser(String username);
}
