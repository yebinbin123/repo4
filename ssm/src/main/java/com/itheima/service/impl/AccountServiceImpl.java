package com.itheima.service.impl;

import com.itheima.domian.Account;
import com.itheima.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询所有方法执行");
        return null;
    }

    @Override
    public void savrAccound() {

    }
}
