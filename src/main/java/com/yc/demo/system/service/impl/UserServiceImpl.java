package com.yc.demo.system.service.impl;


import com.yc.demo.system.dao.UserDao;
import com.yc.demo.system.entity.User;
import com.yc.demo.system.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;

    @Override
    public List<User> queryAll(User user) {
        return userDao.selectAll();
    }
}
