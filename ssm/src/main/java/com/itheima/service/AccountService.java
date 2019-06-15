package com.itheima.service;

import com.itheima.domian.Account;

import java.util.List;

public interface AccountService {

    public List<Account> findAll();

    public void savrAccound();
}
