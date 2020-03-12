package com.shaoshao.mybatis_ch10.controller;

import com.shaoshao.mybatis_ch10.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ss.mybatis.simple.model.SysUser;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("users/{id}")
    SysUser user(@PathVariable("id") Long id) {
        return userService.findById(id);
    }

    @RequestMapping("users")
    List<SysUser> users() {
        return userService.findAll();
    }
}
