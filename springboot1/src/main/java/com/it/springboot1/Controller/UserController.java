package com.it.springboot1.Controller;

import com.it.springboot1.Service.UserService;
import com.it.springboot1.pojo.User;
import com.it.springboot1.pojo.dto.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        userService.registerUser(user);
        return "用户注册成功！";
    }

    @PostMapping("/login")
    public User login(@RequestBody User user) {
        String username = user.getUsername();
        User user1 = userService.login(username);
        if (user1 == null) {
            System.out.println("用户名不存在！");;
        }
        return user1;
    }

    @PostMapping("/update")
    public String update(@RequestBody User user) {
        userService.updateUser(user);
        return "用户信息更新成功！";
    }

    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    public String delete(@RequestBody UserRequest userRequest) {
        userService.deleteUser(userRequest.getUsername());
        return "用户删除成功！";
    }
}
