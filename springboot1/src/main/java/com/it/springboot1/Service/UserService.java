package com.it.springboot1.Service;

import com.it.springboot1.Mapper.UserMapper;
import com.it.springboot1.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public void registerUser(User user){
        userMapper.insertUser(user);
    }
    public User login(String username){
        return userMapper.getUserByUsername(username);
    }
    public void updateUser(User user){
        userMapper.updateUser(user);
    }
    public void deleteUser(String username){
        userMapper.deleteUser(username);
    }
}
