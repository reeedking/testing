package com.automated.testing.controller;

import com.automated.testing.model.User;
import com.automated.testing.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author reeedking
 * @date 2021/3/18
 * @description
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/{id}")
    public User getUserById(@PathVariable String id) {
        return userService.getUserById(id);
    }

    @GetMapping
    public List<User> listUsers() {
        return userService.getUsers();
    }


    @PostMapping
    public int insertUser(@RequestBody User user) {
        return userService.insertUser(user);
    }

    @PutMapping
    public int updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/{id}")
    public int deleteUser(@PathVariable String id) {
        return userService.deleteUserById(id);
    }
}
