package com.bdilib.smeserviceplatform.controller;

import com.bdilib.smeserviceplatform.dao.BankInfo;
import com.bdilib.smeserviceplatform.mapper.BankInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName test
 * @Description TODO
 * @Auther tuantuan
 * @Date 2020/1/13 19:19
 * @Version 1.0
 * @Attention Copyright (C)，2004-2019，BDILab，XiDian University
 **/
@RestController
public class test {
    @Autowired
    BankInfoMapper bankInfoMapper;

    @GetMapping(value = "/test")
    public int test(){
        BankInfo bankInfo = new BankInfo();
        bankInfo.setBankName("test");
        bankInfo.setBankId(1);
        bankInfo.setFkUserId(1);
        bankInfo.setRegion(1);
        bankInfo.setContactName("test");
        bankInfo.setContactPhone("test");
        return bankInfoMapper.insert(bankInfo);
    }

}
