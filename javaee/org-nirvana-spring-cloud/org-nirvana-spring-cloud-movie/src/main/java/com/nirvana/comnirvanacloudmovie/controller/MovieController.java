package com.nirvana.comnirvanacloudmovie.controller;

import com.nirvana.comnirvanacloudmovie.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created by Nirvana on 2018/2/25.
 */
@RestController(value = "/movie")
public class MovieController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/user/{id}")
    public ResponseEntity<User> loadUserById(@PathVariable Long id) {
        return restTemplate.getForEntity("http://localhost:7800/user/"+id, User.class);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
