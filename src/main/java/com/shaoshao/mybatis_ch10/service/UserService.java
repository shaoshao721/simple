package com.shaoshao.mybatis_ch10.service;

import ss.mybatis.simple.model.SysUser;

import java.util.List;

public interface UserService {
    SysUser findById(Long id);

    List<SysUser> findAll();
}
