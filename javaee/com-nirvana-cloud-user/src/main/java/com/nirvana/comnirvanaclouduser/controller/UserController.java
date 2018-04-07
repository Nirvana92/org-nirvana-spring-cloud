package com.nirvana.comnirvanaclouduser.controller;

import com.nirvana.comnirvanaclouduser.entity.User;
import com.nirvana.comnirvanaclouduser.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Nirvana on 2018/2/25.
 */
@RestController
public class UserController {
    @Resource
    private UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User user(@PathVariable Long id) {
        return userRepository.findOne(id);
    }
}
