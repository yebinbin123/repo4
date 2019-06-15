package com.itheima.dao;

import com.itheima.domian.Account;

import java.util.List;

public interface AccountDao {

    public List<Account> findAll();

    public void savrAccound();
}
