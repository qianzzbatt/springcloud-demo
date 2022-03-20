package com.ksd.userservice.controller;

import com.ksd.userservice.pojo.SysUser;
import com.ksd.userservice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 这两个注解的合成 ： Controller + ResponseBody
 * @author A
 */
@RestController
public class UserController {

    @Autowired
    private IUserService userService;


    @GetMapping("/user/{id}")
    public SysUser findById(@PathVariable Long id){
        System.out.println("执行查询了。。。。。。。。");
        return userService.getById(id);
    }
}
