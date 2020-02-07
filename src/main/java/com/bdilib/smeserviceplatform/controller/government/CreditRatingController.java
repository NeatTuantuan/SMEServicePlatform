package com.bdilib.smeserviceplatform.controller.government;

import com.bdilib.smeserviceplatform.controller.response.*;
//import com.bdilib.smeserviceplatform.service.government.CreditingRatingService;
import com.bdilib.smeserviceplatform.service.government.CreditingRatingService;
import com.bdilib.smeserviceplatform.service.government.NameReqService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName CreditRatingController
 * @Description TODO
 * @Author tuantuan
 * @Date 2019/4/14 下午8:02
 * @Version 1.0
 * @Attention Copyright (C), 2004-2019, BDILab, XiDian University
 **/
@RestController
@Api(tags = {"creditRating-企业信用公示功能"})
public class CreditRatingController {
//    @Autowired
//    CreditingRatingService creditingRatingService;
    @Autowired
    NameReqService nameReqService;
    @Autowired
    CreditingRatingService creditingRatingService;


    @PostMapping(value = "government/creditRating")
    public ResponseResult creditRating(@RequestParam String enterpriseName, @RequestParam Integer creditRating){
        ResponseResult responseResult = new ResponseResult();
        creditingRatingService.creditingRating(enterpriseName,creditRating);
        responseResult.setSuccess(true);
        responseResult.setCode(GovernmentCode.CREDIT_RATING_SUCCESS.getCode());
        responseResult.setMessage(GovernmentCode.CREDIT_RATING_SUCCESS.getMessage());
        return responseResult;
    }
    @GetMapping(value = "government/enterpriseNameReq")
    public ResponseResult enterpriseNameReq(){
        ResponseResult responseResult = new ResponseResult();
        responseResult.setSuccess(true);
        responseResult.setData(nameReqService.enterpriseNameReq());
        responseResult.setCode(GovernmentCode.NAME_REQ_SUCCESS.getCode());
        responseResult.setMessage(GovernmentCode.NAME_REQ_SUCCESS.getMessage());
        return responseResult;
    }
}
