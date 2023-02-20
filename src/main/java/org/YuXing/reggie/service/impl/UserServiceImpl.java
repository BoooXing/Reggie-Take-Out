package org.YuXing.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.YuXing.reggie.entity.User;
import org.YuXing.reggie.mapper.UserMapper;
import org.YuXing.reggie.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService{

}
