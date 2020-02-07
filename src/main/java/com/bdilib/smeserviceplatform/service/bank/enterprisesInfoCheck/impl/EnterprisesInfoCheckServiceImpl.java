package com.bdilib.smeserviceplatform.service.bank.enterprisesInfoCheck.impl;

import com.bdilib.smeserviceplatform.mapper.EnterpriseInfoMapper;
import com.bdilib.smeserviceplatform.service.bank.enterprisesInfoCheck.EnterprisesInfoCheckService;
import com.bdilib.smeserviceplatform.vo.EnterpriseInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lr
 * @Package com.bdilib.smeserviceplatform.service.bank.enterprisesInfoCheck.impl
 * @date 2020/2/3 11:11
 * @description
 */
@Service
public class EnterprisesInfoCheckServiceImpl implements EnterprisesInfoCheckService{
    @Autowired
    EnterpriseInfoMapper enterpriseInfoMapper;

    @Override
    public EnterpriseInfoVO enterprisesInfoCheck(String enterpriseName){

        return enterpriseInfoMapper.select(enterpriseName);
    }
}
