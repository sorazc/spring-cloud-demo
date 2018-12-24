package cn.zc.consumer.controller;

import cn.zc.user.client.UserClient;
import cn.zc.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserClient userClient;

    @GetMapping("user/id/{id}")
    public User getUserById(@PathVariable("id") Long id) {
        return userClient.getById(id);
    }

}
