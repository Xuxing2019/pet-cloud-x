package com.adms.pet.cloud.admin.controller;

import com.adms.pet.cloud.admin.service.AccountService;
import com.adms.pet.cloud.common.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @description: TODO 
 * @author xu.h.b
 * @date 2020/8/26 15:01
 */
@Controller
public class AdminController {

    @Autowired
    AccountService accountService;

    @RequestMapping("/main")
    public ModelAndView toMain(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("main");
        return modelAndView;
    }

    @RequestMapping("/index")
    public String toIndex(){
        System.err.println("热部署更新");
        return "main";
    }

    @ResponseBody
    @RequestMapping(value = {"/find/account/all"})
    public List<Account> findAccountAll(){
        return accountService.selectAll();
    }
}
