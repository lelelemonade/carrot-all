package org.carrot.carrothttp.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Reference;
import org.carrot.carrotapi.api.IHelloService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @DubboReference(version = "1.0.0")
    private IHelloService helloService;

    @PostMapping("/hello")
    public String hello(){
        return helloService.sayHello();
    }
}
