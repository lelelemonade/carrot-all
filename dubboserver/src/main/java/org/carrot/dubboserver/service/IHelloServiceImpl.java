package org.carrot.dubboserver.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.carrot.carrotapi.api.IHelloService;
import org.springframework.stereotype.Service;

/**
 * @author zhonglishen
 */
@DubboService(version = "1.0.0")
@Service
public class IHelloServiceImpl implements IHelloService {
    @Override
    public String sayHello() {
        return "Hello!";
    }
}
