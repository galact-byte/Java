package com.it.springboot.service;

import com.it.springboot.pojo.User;
import com.it.springboot.pojo.dto.UserDto;
import com.it.springboot.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //spring的bean
public class UserService implements IUserService{
    @Autowired
    UserRepository userRepository;
    @Override
    public User addUser(UserDto user) {
        User user1=new User();
        BeanUtils.copyProperties(user,user1);
        return userRepository.save(user1);
    }

    @Override
    public User getUser(Integer Id) {
        return userRepository.findById(Id).orElseThrow(()->{
            throw new IllegalArgumentException("用户不存在");
        });
    }

    @Override
    public User updateUser(UserDto user) {
        User existingUser=userRepository.findById(user.getId()).orElseThrow(()->{
            throw new IllegalArgumentException("用户不存在");
        });
        BeanUtils.copyProperties(user,existingUser);
        return userRepository.save(existingUser);
    }

    @Override
    public void deleteUser(Integer id) {
        if(!userRepository.existsById(id)){
            throw new IllegalArgumentException("用户不存在，无法删除");
        }
        userRepository.deleteById(id);
    }
}
