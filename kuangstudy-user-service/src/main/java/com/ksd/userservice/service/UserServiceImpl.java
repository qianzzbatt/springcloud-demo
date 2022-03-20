package com.ksd.userservice.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ksd.userservice.mapper.UserMapper;
import com.ksd.userservice.pojo.SysUser;
import org.springframework.stereotype.Service;

/**
 * 业务层类
 * @author A
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, SysUser> implements IUserService {


}
