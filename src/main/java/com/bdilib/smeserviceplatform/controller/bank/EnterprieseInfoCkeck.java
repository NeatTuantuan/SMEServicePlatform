package com.bdilib.smeserviceplatform.controller.bank;


import com.bdilib.smeserviceplatform.service.bank.enterprisesInfoCheck.EnterprisesInfoCheckService;
import com.bdilib.smeserviceplatform.vo.EnterpriseInfoVO;
import io.swagger.annotations.Api;

import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.bdilib.smeserviceplatform.controller.response.*;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

@RestController
@Api(tags = {"EnterprieseInfoCkeck-银行查看企业信息功能"})
public class EnterprieseInfoCkeck {
    @Autowired
    EnterprisesInfoCheckService enterprisesInfoCheckService;
//    @ApiImplicitParam(name = "enterpriseName", value = "企业名称")
    @RequestMapping(value = "bank/enterprieseInfoCkeck", method = RequestMethod.POST)
    public ResponseResult EnterprieseInfoCkeck  (@ApiParam(value = "填写企业名称")@RequestParam String enterpriseName)
    {
        ResponseResult responseResult = new ResponseResult();
        EnterpriseInfoVO enterpriseInfoVO= enterprisesInfoCheckService.enterprisesInfoCheck(enterpriseName);
        if(enterpriseInfoVO==null)
        {
            responseResult.setCode(BankCode.CHENCK_FAILED.getCode());
            responseResult.setMessage(BankCode.CHENCK_FAILED.getMessage());
            responseResult.setSuccess(FALSE);
        }
        else
        {
            responseResult.setData(enterpriseInfoVO);
            responseResult.setCode(BankCode.CHECK_SUCCESS.getCode());
            responseResult.setMessage(BankCode.CHECK_SUCCESS.getMessage());
            responseResult.setSuccess(TRUE);

        }
        return  responseResult;

    }


}
