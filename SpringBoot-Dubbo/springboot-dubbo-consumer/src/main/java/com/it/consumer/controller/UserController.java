package com.it.consumer.controller;

import com.it.dubbo.api.IUserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Reference(check = false,version = "1.0.0")
    private IUserService useService;


    @RequestMapping("/sayHello")
    public String sayHello(String name){
        return useService.sayHello(name);
    }

}
