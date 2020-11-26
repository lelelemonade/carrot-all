package org.carrot.carrothttp.controller;

import org.carrot.carrotapi.entity.Account;
import org.carrot.carrotapi.entity.User;
import org.carrot.carrothttp.mapper.AccountMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhonglishen
 */
@RestController
public class TestMapperController {

    @PostMapping("/testmapper")
    public User getUser(){
        Account account = Account.builder()
                .accountId(1L)
                .email("shenzhongli@tp-link.com.cn")
                .name("shenzhongli")
                .password("123456")
                .sex('f')
                .build();
        return AccountMapper.INSTANCE.accountToUser(account);
    }
}
