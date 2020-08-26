package com.adms.pet.cloud.admin.mapper;


import com.adms.pet.cloud.common.entity.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 帐户dao接口
 */
@Mapper
public interface AccountMapper {
    // 查询所有账户
    public List<Account> findAll();

}
