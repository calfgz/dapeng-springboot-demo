package com.dapeng.springboot.service.impl;

import com.dapeng.springboot.api.domain.User;
import com.dapeng.springboot.api.service.UserService;
import com.github.dapeng.core.SoaException;
import com.github.dapeng.spring.annotation.DapengService;

import java.util.Optional;

/**
 * @author zhongwm
 */
@DapengService(service = UserServiceImpl.class)
public class UserServiceImpl implements UserService {

    @Override
    public String sayHello(String name) throws SoaException {
        return "Hello " + name;
    }

    @Override
    public User getUser(String id) throws SoaException {
        User user = new User();
        user.setId(Optional.ofNullable(id));
        user.setName(Optional.of("张三"));
        user.setAge(20);
        return user;
    }
}
