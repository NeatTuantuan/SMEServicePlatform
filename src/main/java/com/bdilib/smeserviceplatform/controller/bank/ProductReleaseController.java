package com.bdilib.smeserviceplatform.controller.bank;

import com.bdilib.smeserviceplatform.controller.response.*;
import com.bdilib.smeserviceplatform.service.bank.productRelease.ProductReleaseService;
import com.bdilib.smeserviceplatform.vo.FinancialProductVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = {"productRelease-银行产品发布功能"})
public class ProductReleaseController {
    @Autowired
    ProductReleaseService productrelease;

    @RequestMapping(value = "bank/productRelease", method = RequestMethod.POST)
    public ResponseResult productrelease(@ApiParam(value = "填写产品发布相关信息")@RequestBody FinancialProductVO financialProductVO)
    {
        ResponseResult responseResult = new ResponseResult();
        int result = productrelease.productrelease(financialProductVO);
        try {
            if (result == 0) {
                responseResult.setSuccess(false);
                responseResult.setCode(BankCode.RELEASE_FAILED.getCode());
                responseResult.setMessage(BankCode.RELEASE_FAILED.getMessage());
            } else {
                responseResult.setMessage(BankCode.RELEASE_SUCCESS.getMessage());
                responseResult.setSuccess(true);
                responseResult.setCode(BankCode.RELEASE_SUCCESS.getCode());
            }
        }catch (Exception e) {
        responseResult.setSuccess(false);
        responseResult.setCode(BankCode.RELEASE_FAILED.getCode());
        responseResult.setMessage(BankCode.RELEASE_FAILED.getMessage());
        }
        return responseResult;

    }

}
