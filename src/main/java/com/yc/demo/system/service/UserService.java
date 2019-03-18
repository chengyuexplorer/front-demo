package com.yc.demo.system.service;


import com.yc.demo.system.entity.User;

import java.util.List;

public interface UserService {

    /**
     * 查询所有
     */
    List<User> queryAll(User user);
}
