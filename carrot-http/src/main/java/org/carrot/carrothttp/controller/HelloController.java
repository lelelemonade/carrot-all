package org.carrot.carrothttp.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Reference;
import org.carrot.carrotapi.api.IHelloService;
import org.carrot.carrotapi.dal.UserService;
import org.carrot.carrotapi.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @DubboReference(version = "1.0.0")
    private IHelloService helloService;

//    @DubboReference
//    private UserService userService;

    @PostMapping("/hello")
    public String hello(){
        return helloService.sayHello();
    }

//    @PostMapping("/getuser")
//    public User getUser(@RequestParam String name){
//        return userService.getUserName(name);
//    }
}
