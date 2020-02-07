package com.bdilib.smeserviceplatform.service.government;

import java.util.List;

public interface NameReqService {
    /**
     * 数据库中查找所有未评级企业名称
     * @return
     */
    List<String> enterpriseNameReq();
}
