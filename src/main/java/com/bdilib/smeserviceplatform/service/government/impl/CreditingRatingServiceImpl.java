package com.bdilib.smeserviceplatform.service.government.impl;


import com.bdilib.smeserviceplatform.dao.EnterpriseInfo;
import com.bdilib.smeserviceplatform.mapper.EnterpriseInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bdilib.smeserviceplatform.service.government.CreditingRatingService;


/**
 * @ClassName creditingRatingServiceImpl
 * @Description TODO
 * @Author tuantuan
 * @Date 2019/4/14 下午8:10
 * @Version 1.0
 * @Attention Copyright (C), 2004-2019, BDILab, XiDian University
 **/
@Service
public class CreditingRatingServiceImpl implements CreditingRatingService {
    @Autowired
    EnterpriseInfoMapper enterpriseInfoMapper;

    @Override
    public void creditingRating(String enterpriseName, Integer creditRating) {
        EnterpriseInfo enterpriseInfo = enterpriseInfoMapper.selectByEnterpriseName(enterpriseName);
        enterpriseInfo.setCreditRate(creditRating);
        enterpriseInfoMapper.updateByPrimaryKeySelective(enterpriseInfo);
    }
}
