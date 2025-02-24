package com.it.springboot.controller;

import com.it.springboot.pojo.ResponseMessage;
import com.it.springboot.pojo.User;
import com.it.springboot.pojo.dto.UserDto;
import com.it.springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController   //允许接口方法返回对象，转换成json文本
@RequestMapping("/user")   //localhost:8080/user
public class UserController {
    @Autowired
    IUserService userService;
    // 增加
    @PostMapping     //URL: localhost:8080/user  method:post
    public ResponseMessage addUser(@Validated @RequestBody UserDto user){
        User userNew=userService.addUser(user);
        return ResponseMessage.success(userNew);
    }
    // 删除
    @DeleteMapping("/{Id}")   //URL: localhost:8080/user/1  method:delete
    public ResponseMessage deleteUser(@PathVariable Integer Id){
        userService.deleteUser(Id);
        return ResponseMessage.success();
    }
    // 修改
    @PutMapping
    public ResponseMessage updateUser(@Validated @RequestBody UserDto user){
        User userNew=userService.updateUser(user);
        return ResponseMessage.success(userNew);
    }
    // 查询
    @GetMapping("/{Id}")   //URL: localhost:8088/user/1  method:get
    public ResponseMessage getUser(@PathVariable Integer Id){
        User userNew=userService.getUser(Id);
        return ResponseMessage.success(userNew);
    }
}
