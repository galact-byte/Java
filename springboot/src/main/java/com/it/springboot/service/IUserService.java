package com.it.springboot.service;

import com.it.springboot.pojo.User;
import com.it.springboot.pojo.dto.UserDto;

public interface IUserService {
    /**
     * 插入用户
     *
     * @param user
     * @return
     */
    User addUser(UserDto user);
    /**
     * 根据id查询用户
     *
     * @param Id 用户id
     * @return
     */
    User getUser(Integer Id);
    /**
     * 更新用户
     *
     * @param user 修改用户对象
     * @return
     */
    User updateUser(UserDto user);
    /**
     * 删除用户
     *
     * @param id 用户id
     */
    void deleteUser(Integer id);
}
