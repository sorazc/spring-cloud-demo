package cn.zc.user.controller;

import cn.zc.user.service.UserService;
import cn.zc.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("id/{id}")
    public User getById(@PathVariable("id") Long id) {
        return userService.getById(id);
    }

}
