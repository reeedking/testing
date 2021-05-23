package com.automated.testing.service.impl;

import com.automated.testing.mapper.UserMapper;
import com.automated.testing.model.User;
import com.automated.testing.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

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
        return userMapper.selectById(id);
    }

    @Override
    public List<User> getUsers() {
        return userMapper.selectList(null);
    }

    @Override
    public int insertUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateById(user);
    }

    @Override
    public int deleteUserById(String id) {
        return userMapper.deleteById(id);
    }

}
