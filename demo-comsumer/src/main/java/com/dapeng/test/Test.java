package com.dapeng.test;

import com.dapeng.springboot.api.UserServiceClient;
import com.dapeng.springboot.api.domain.User;
import com.github.dapeng.core.SoaException;

public class Test {
    public static void main(String[] args) throws SoaException {

        System.setProperty("soa.zookeeper.host", "127.0.0.1:2181");
        UserServiceClient userServiceClient = new UserServiceClient();
        String res = userServiceClient.sayHello("Dapeng");
        System.out.println("result-->" + res);
        User user = userServiceClient.getUser("1");
        System.out.println("user-->" + user);
    }
}
