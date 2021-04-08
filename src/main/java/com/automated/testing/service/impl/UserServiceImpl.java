package com.automated.testing.service.impl;

import com.automated.testing.mapper.UserMapper;
import com.automated.testing.model.User;
import com.automated.testing.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author reeedking
 * @date  2021/3/18
 * @description
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;
    
    @Override
    public User getUserById(String id) {
        User user = new User();
        user.setId("1");
        user.setName("wh");
        return user;
    }

    @Override
    public List<User> getUsers() {
        return userMapper.selectList(null);
    }

    @Override
    public int insertUser(User user) {
        return 0;
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }

    @Override
    public int deleteUserById(String id) {
        return 0;
    }

}
