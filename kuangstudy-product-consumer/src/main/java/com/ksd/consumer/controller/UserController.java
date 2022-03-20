package com.ksd.consumer.controller;


import com.ksd.consumer.pojo.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    // 注册中心版本 - 无负载均衡版本
    @GetMapping("/get2/{id}")
    public SysUser getUser3(@PathVariable("id")Long id){
        String url = "http://localhost:8081/user/"+id;
        return restTemplate.getForObject(url,SysUser.class);
    }
}
