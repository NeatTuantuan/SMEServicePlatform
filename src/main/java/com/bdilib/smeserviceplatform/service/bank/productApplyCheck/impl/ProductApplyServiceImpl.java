package com.bdilib.smeserviceplatform.service.bank.productApplyCheck.impl;

import com.bdilib.smeserviceplatform.dao.EnterpriseInfo;
import com.bdilib.smeserviceplatform.dao.FinancialProduct;
import com.bdilib.smeserviceplatform.dao.ProductRequest;
import com.bdilib.smeserviceplatform.mapper.BankInfoMapper;
import com.bdilib.smeserviceplatform.mapper.EnterpriseInfoMapper;
import com.bdilib.smeserviceplatform.mapper.FinancialProductMapper;
import com.bdilib.smeserviceplatform.mapper.ProductRequestMapper;
import com.bdilib.smeserviceplatform.service.bank.productApplyCheck.ProductApplyService;
import com.bdilib.smeserviceplatform.vo.ProductApplyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName ProductApplyServiceImpl
 * @Description TODO
 * @Author lr
 * @Date
 * @Version 1.0
 * @Attention Copyright (C), 2004-2019, BDILab, XiDian University
 **/
@Service
public class ProductApplyServiceImpl implements ProductApplyService {
    @Autowired
    BankInfoMapper bankInfoMapper;
    @Autowired
    FinancialProductMapper financialProductMapper;
    @Autowired
    ProductRequestMapper productRequestMapper;
    @Autowired
    EnterpriseInfoMapper enterpriseInfoMapper;

    /**
     * 根据银行名称查询该银行所有的产品名称
     * @param bankName
     * @return
     */
    @Override
    public List<String> checkProName(String bankName) {
        Integer userId = bankInfoMapper.selectfkUserIdByBankName(bankName);
        ArrayList<String> productName = new ArrayList<>();
        List<FinancialProduct> financialProductList = financialProductMapper.selectByfkUserId(userId);
        for (int i=0;i<financialProductList.size();i++){
            productName.add(financialProductList.get(i).getProductName());
        }
        return productName;
    }

    /**
     * 查询银行所有金融产品的产品请求
     * @param
     * @return
     */
    public List<ProductApplyVO> getAllProRequest(String bankName){
        ArrayList<String> productName = (ArrayList<String>) this.checkProName(bankName);
        ArrayList<ProductApplyVO> productApplyVOS = new ArrayList<>();
        for(String productname : productName){
            Integer id = financialProductMapper.selectIdByProductName(productname);//financial_product中通过产品名查找id
            List<ProductRequest> productRequestList = productRequestMapper.selectByProductId(id);
            for(int i=0;i<productRequestList.size();i++){
                ProductApplyVO productApplyVO = new ProductApplyVO();
                Date date = productRequestList.get(i).getRequestTime();
                Integer request_id = productRequestList.get(i).getId();
                Integer enterpriseId = productRequestList.get(i).getFkUserId();
                EnterpriseInfo enterpriseInfo = enterpriseInfoMapper.selectByUserId(enterpriseId);
                String enterpriseName = enterpriseInfo.getEnterpriseName();
                String socialCode = enterpriseInfo.getSocialCode();
                productApplyVO.setEnterpriseName(enterpriseName);
                productApplyVO.setFkProductName(productname);
                productApplyVO.setFkSocialCode(socialCode);
                productApplyVO.setRequestId(request_id);
                productApplyVO.setRequestTime(date);
                productApplyVOS.add(productApplyVO);
            }
        }
        return productApplyVOS  ;
    }
}
