package com.yc.demo.system.dao;

import com.yc.demo.system.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserDao {
    /**
     * 查询所有
     */
    List<User> selectAll();
}
