package com.bdilib.smeserviceplatform.service.bank.productRelease;

import com.bdilib.smeserviceplatform.dao.FinancialProduct;
import com.bdilib.smeserviceplatform.vo.FinancialProductVO;

/**
 * @author lr
 * @Package com.bdilib.smeserviceplatform.service.bank.productRelease.impl
 * @date 2020/2/2 12:32
 * @description  金融机构用户填写相关的产品信息向平台发布产品
 */
public interface ProductReleaseService {
    int productrelease(FinancialProductVO financialProductVO);
}
