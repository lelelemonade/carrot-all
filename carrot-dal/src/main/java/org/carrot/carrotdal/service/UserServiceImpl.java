package org.carrot.carrotdal.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.carrot.carrotapi.dal.UserService;
import org.carrot.carrotapi.entity.User;
import org.carrot.carrotdal.mapper.UserMapper;

import javax.annotation.Resource;

@DubboService
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User getUserName(String name) {
        return userMapper.findByName(name);
    }
}
