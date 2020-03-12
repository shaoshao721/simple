package com.shaoshao.mybatis_ch10.service.impl;

import com.shaoshao.mybatis_ch10.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ss.mybatis.simple.mapper.UserMapper;
import ss.mybatis.simple.model.SysUser;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public SysUser findById(Long id) {
        return userMapper.selectById(id);
    }

    @Override
    public List<SysUser> findAll() {
        return userMapper.selectAll();
    }
}
