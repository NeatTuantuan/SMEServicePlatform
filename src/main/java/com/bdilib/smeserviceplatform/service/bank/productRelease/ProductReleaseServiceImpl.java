package com.bdilib.smeserviceplatform.service.bank.productRelease;

import com.bdilib.smeserviceplatform.controller.bank.BankCode;
import com.bdilib.smeserviceplatform.controller.response.ResponseResult;
import com.bdilib.smeserviceplatform.dao.FinancialProduct;
import com.bdilib.smeserviceplatform.mapper.BankInfoMapper;
import com.bdilib.smeserviceplatform.mapper.FinancialProductMapper;
import com.bdilib.smeserviceplatform.vo.FinancialProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lr
 * @Package com.bdilib.smeserviceplatform.service.bank.productRelease.impl
 * @date 2020/2/2 12:32
 * @description  金融机构用户填写相关的产品信息入数据库
 */
@Service
public class ProductReleaseServiceImpl implements ProductReleaseService{
    @Autowired
    FinancialProductMapper financialProductMapper;
    @Autowired
    BankInfoMapper bankInfoMapper;

    @Override
    public int productrelease(FinancialProductVO financialProductVO){
//        ResponseResult responseResult = new ResponseResult();
        String bankName = financialProductVO.getBankName();
        Integer bankId = financialProductVO.getFkBankId();
        Integer userId = bankInfoMapper.selectfkUserIdByBankNameAndBankId(bankName,bankId);
        if(userId == null){//银行名错误，填写正确信息
//            responseResult.setSuccess(false);
//            responseResult.setCode(BankCode.RELEASE_FAILED.getCode());
//            responseResult.setMessage(BankCode.RELEASE_FAILED.getMessage());
            System.out.println("银行名错误，填写正确信息");
            return 0;
        }
        else {
            String productName = financialProductVO.getProductName();
            int institutionType = financialProductVO.getInstitutionType();
            Double rateLowerLimit = financialProductVO.getRateLowerLimit();
            Double rateUpperLimit = financialProductVO.getRateUpperLimit();
            int generality = financialProductVO.getGenerality();
            int internetLoanType = financialProductVO.getInternetLoanType();
            int productProperties = financialProductVO.getProductProperties();
            int paymentType = financialProductVO.getPaymentType();
            int loanType = financialProductVO.getLoanType();
            int loanLimit = financialProductVO.getLoanLimit();
            int loanPeriod = financialProductVO.getLoanPeriod();
            int guaranteeMode = financialProductVO.getGuaranteeMode();
            String userArea = financialProductVO.getUseArea();
            String description = financialProductVO.getDescription();
            FinancialProduct financialProduct = new FinancialProduct();
            financialProduct.setFkUserId(userId);
            financialProduct.setProductName(productName);
            financialProduct.setInstitutionType(institutionType);
            financialProduct.setRateLowerLimit(rateLowerLimit);
            financialProduct.setRateUpperLimit(rateUpperLimit);
            financialProduct.setGenerality(generality);
            financialProduct.setInternetLoanType(internetLoanType);
            financialProduct.setProductProperties(productProperties);
            financialProduct.setPaymentType(paymentType);
            financialProduct.setLoanType(loanType);
            financialProduct.setLoanLimit(loanLimit);
            financialProduct.setLoanPeriod(loanPeriod);
            financialProduct.setGuaranteeMode(guaranteeMode);
            financialProduct.setUseArea(userArea);
            financialProduct.setDescription(description);
            return financialProductMapper.insert(financialProduct);
        }
    }
}
