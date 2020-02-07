package com.bdilib.smeserviceplatform.service.bank.demandcheck.impl;

import com.bdilib.smeserviceplatform.dao.EnterpriseInfo;
import com.bdilib.smeserviceplatform.mapper.EnterpriseInfoMapper;
import com.bdilib.smeserviceplatform.mapper.EnterpriseReqMapper;
import com.bdilib.smeserviceplatform.service.bank.demandcheck.DemandCheckService;
import com.bdilib.smeserviceplatform.vo.DemandCheckVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DemandCheckServiceImpl implements DemandCheckService {
    @Autowired
    EnterpriseReqMapper enterpriseReqMapper;

    @Autowired
    EnterpriseInfoMapper enterpriseInfoMapper;

    @Override
    public List<DemandCheckVO> demandcheck(Integer loanLimit, double rateLowerLimit, double rateUpperLimit, Integer loanPeriod, Integer guaranteeMode)
    {
        List<DemandCheckVO> demandCheckVOList = new ArrayList<>();
        List<Integer> userId = new ArrayList<>();
        demandCheckVOList = enterpriseReqMapper.selectByDemandCheck(loanLimit,rateLowerLimit,rateUpperLimit,loanPeriod,guaranteeMode);
        userId = enterpriseReqMapper.selectFkUserIdByDemandCheck(loanLimit,rateLowerLimit,rateUpperLimit,loanPeriod,guaranteeMode);

        for(int i=0;i<userId.size()&&i<demandCheckVOList.size();i++){
            EnterpriseInfo enterpriseInfos =enterpriseInfoMapper.selectByUserId(userId.get(i));
            demandCheckVOList.get(i).setEnterpriseName(enterpriseInfos.getEnterpriseName());
            demandCheckVOList.get(i).setFkSocialCode(enterpriseInfos.getSocialCode());
            }
        return demandCheckVOList;
    }
}
