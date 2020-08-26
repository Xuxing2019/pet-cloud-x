package com.adms.pet.cloud.admin.service.impl;

import com.adms.pet.cloud.admin.mapper.AccountMapper;
import com.adms.pet.cloud.admin.service.AccountService;
import com.adms.pet.cloud.common.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: TODO 
 * @author xu.h.b
 * @date 2020/8/26 15:17
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountMapper accountMapper;

    @Override
    public List<Account> selectAll() {
        return accountMapper.findAll();
    }
}
