package com.bdilib.smeserviceplatform.controller.bank;


import com.bdilib.smeserviceplatform.controller.response.ResponseResult;
import com.bdilib.smeserviceplatform.dao.EnterpriseInfo;
import com.bdilib.smeserviceplatform.dao.FinancialProduct;
import com.bdilib.smeserviceplatform.service.bank.productApplyCheck.ProductApplyService;
import com.bdilib.smeserviceplatform.vo.ProductApplyVO;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @ClassName ProductApplyController
 * @Description TODO
 * @Author lr
 * @Date
 * @Version 1.0
 * @Attention Copyright (C), 2004-2019, BDILab, XiDian University
 **/
@RestController
@Api(tags = {"ProductApply-企业申请查看"})
public class ProductApplyController {
    @Autowired
    ProductApplyService productApplyService;

    @PostMapping(value = "bank/productApply")
    public ResponseResult productApply(@RequestParam String bankName){
        ResponseResult responseResult = new ResponseResult();
        List<ProductApplyVO> productApplyVOS = productApplyService.getAllProRequest(bankName);
        if (productApplyVOS.size()!= 0&&productApplyVOS.contains(null)==false){
            responseResult.setData(productApplyVOS);
            responseResult.setSuccess(true);
            responseResult.setCode(BankCode.PRODUCT_APPLY_SUCCESS.getCode());
            responseResult.setMessage(BankCode.PRODUCT_APPLY_SUCCESS.getMessage());
        }
       else{
            responseResult.setSuccess(false);
            responseResult.setCode(BankCode.PRODUCT_APPLY_FAILED.getCode());
            responseResult.setMessage(BankCode.PRODUCT_APPLY_FAILED.getMessage());
        }
//        try {
//            responseResult.setData(productApplyService.checkProName(bankName));
//            responseResult.setSuccess(true);
//            responseResult.setCode(BankCode.PRODUCT_APPLY_SUCCESS.getCode());
//            responseResult.setMessage(BankCode.PRODUCT_APPLY_SUCCESS.getMessage());
//        }
//        catch(Exception e){
//            responseResult.setSuccess(false);
//            responseResult.setCode(BankCode.PRODUCT_APPLY_FAILED.getCode());
//            responseResult.setMessage(BankCode.PRODUCT_APPLY_FAILED.getMessage());
//        }
        return responseResult;
    }

}
