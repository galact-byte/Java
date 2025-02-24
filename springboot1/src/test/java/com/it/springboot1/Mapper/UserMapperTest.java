package com.it.springboot1.Mapper;

import com.it.springboot1.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void testInsertUser(){
        User user = new User();
        user.setUsername("张无忌");
        user.setAge(18);
        user.setGender("男");
        user.setAddress("北京");
        user.setPhone("123456789");
        userMapper.insertUser(user);

        User insertedUser = userMapper.getUserByUsername(user.getUsername());
        assertNotNull(insertedUser);
        assertEquals("张无忌",insertedUser.getUsername());
    }
    @Test
    public void testUpdateUser(){
        User user = userMapper.getUserByUsername("张无忌");
        user.setAge(20);
        user.setGender("无性别");
        user.setAddress("明教");
        userMapper.updateUser(user);

        User updatedUser = userMapper.getUserByUsername("张无忌");
        assertEquals("20",updatedUser.getAge());
        assertEquals("无性别",updatedUser.getGender());
        assertEquals("明教",updatedUser.getAddress());
    }
    @Test
    public void testDeleteUser(){
        userMapper.deleteUser("张无忌");
        User deletedUser = userMapper.getUserByUsername("张无忌");
        assertNull(deletedUser);
    }
    @Test
    public void testGetUserByUsername(){
        User user = userMapper.getUserByUsername("张无忌");
        assertNotNull(user);
        assertEquals("张无忌",user.getUsername());
    }
}
