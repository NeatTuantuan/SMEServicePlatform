package com.bdilib.smeserviceplatform.service.bank.productApplyCheck;

import com.bdilib.smeserviceplatform.dao.EnterpriseInfo;
import com.bdilib.smeserviceplatform.dao.FinancialProduct;
import com.bdilib.smeserviceplatform.dao.ProductRequest;
import com.bdilib.smeserviceplatform.vo.ProductApplyVO;


import java.util.Date;
import java.util.List;

public interface ProductApplyService {
    /**
     * 根据银行名称查看金融产品
     * @param bankName
     * @return
     */
//    List<String> checkProName(String bankName);
        List<String> checkProName(String bankName);


    /**
     * 查询银行所有金融产品的产品请求
     * @param bankName
     * @return
     */
    List<ProductApplyVO> getAllProRequest(String bankName);


}
