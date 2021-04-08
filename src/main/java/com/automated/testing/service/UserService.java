package com.automated.testing.service;

import com.automated.testing.model.User;

import java.util.List;

/**
 * @author reeedking
 * @date  2021/3/18
 */
public interface UserService {

    /**
     * 通过用户id获取用户信息
     * @author reeedking
     * @param id 用户id
     * @return User
     */
    User getUserById(String id);

    /**
     * 获取所有用户信息
     * @author reeedking
     * @return List
     */
    List<User> getUsers();

    /**
     * 添加用户信息
     * @author reeedking
     * @param user user
     * @return int
     */
    int insertUser(User user);

    /**
     * 修改用户信息
     * @author reeedking
     * @param user user
     */
    int updateUser(User user);

    /**
     *
     * @author reeedking
     * @param id 用户id
     * @return int
     */
    int deleteUserById(String id);
}
