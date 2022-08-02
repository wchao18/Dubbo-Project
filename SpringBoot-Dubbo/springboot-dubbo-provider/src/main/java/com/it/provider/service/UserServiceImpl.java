package com.it.provider.service;

import com.it.dubbo.api.IUserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service(interfaceClass = IUserService.class,version = "1.0.0")
@Component
public class UserServiceImpl implements IUserService {
    @Override
    public String sayHello(String name) {
        return "hello:" + name;
    }
}
