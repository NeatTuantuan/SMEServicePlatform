package com.bdilib.smeserviceplatform.service.government.impl;


import com.bdilib.smeserviceplatform.dao.EnterpriseInfo;
import com.bdilib.smeserviceplatform.mapper.EnterpriseInfoMapper;
import com.bdilib.smeserviceplatform.service.government.NameReqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName NameReqServiceImpl
 * @Description TODO
 * @Author lr
 * @Date
 * @Version 1.0
 * @Attention Copyright (C), 2004-2019, BDILab, XiDian University
 **/
@Service
public class NameReqServiceImpl implements NameReqService {
    @Autowired
    EnterpriseInfoMapper enterpriseInfoMapper;

    @Override
    public List<String> enterpriseNameReq() {

        List<EnterpriseInfo> enterpriseInfoList = enterpriseInfoMapper.selectCreditRateIsNull();
        List<String> nameList = new ArrayList<>();
        for (EnterpriseInfo enterpriseInfo : enterpriseInfoList){
            nameList.add(enterpriseInfo.getEnterpriseName());
        }
        return nameList;
    }
}
