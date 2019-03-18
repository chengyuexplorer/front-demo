package com.yc.demo.system.controller;

import com.yc.demo.system.entity.User;
import com.yc.demo.system.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * 验证数据库连接是否成功
 */
@Controller
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/query")
    @ResponseBody
    public String user(){
        User user = new User();
        List<User> userList = userService.queryAll(user);
        log.info(userList.toString());
        return "success";
    }


}
