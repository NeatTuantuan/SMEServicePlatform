package com.bdilib.smeserviceplatform.controller.bank;


import com.bdilib.smeserviceplatform.service.bank.demandcheck.DemandCheckService;
import com.bdilib.smeserviceplatform.controller.response.*;
import com.bdilib.smeserviceplatform.vo.DemandCheckVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = {"demandCheck-银行查看企业需求功能"})
public class DemandCheck {
    @Autowired
    private DemandCheckService demandCheckService;
    @ApiImplicitParams({
            @ApiImplicitParam(name = "loanLimit", value = "贷款额度(枚举)"),
            @ApiImplicitParam(name = "rateLowerLimit", value = "利率下限（单位%）"),
            @ApiImplicitParam(name = "rateUpperLimit", value = "利率上限（单位%）"),
            @ApiImplicitParam(name = "loanPeriod", value = "贷款期限（单位：月）"),
            @ApiImplicitParam(name = "guaranteeMode", value = "担保方式"),
    })
    @RequestMapping(value = "bank/demandCheck", method = RequestMethod.POST)
    public ResponseResult Demandcheck(@RequestParam Integer loanLimit,
                                      @RequestParam double rateLowerLimit,
                                      @RequestParam double rateUpperLimit,
                                      @RequestParam Integer loanPeriod,
                                      @RequestParam Integer guaranteeMode)
    {
        List<DemandCheckVO> demandCheckVOList = null;
        ResponseResult responseResult = new ResponseResult();
        demandCheckVOList = demandCheckService.demandcheck(loanLimit,rateLowerLimit,rateUpperLimit,loanPeriod,guaranteeMode);
        if(demandCheckVOList.size()!=0){
            responseResult.setData(demandCheckVOList);
            responseResult.setCode(BankCode.CHECK_SUCCESS.getCode());
            responseResult.setMessage(BankCode.CHECK_SUCCESS.getMessage());
            responseResult.setSuccess(true);
        }
        else{
            responseResult.setCode(BankCode.CHENCK_FAILED.getCode());
            responseResult.setMessage(BankCode.CHENCK_FAILED.getMessage());
            responseResult.setSuccess(false);
        }
        return responseResult;
    }

}
