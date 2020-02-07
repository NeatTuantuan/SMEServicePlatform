package com.bdilib.smeserviceplatform.vo;

import java.util.Date;

/**
 * @author lr
 * @Package com.bdilib.smeserviceplatform.vo
 * @date 2020/2/3 17:36
 * @description
 */
public class ProductApplyVO {
    /**
     * 自增字段，唯一标识一条记录
     */
    private int requestId;
    /**
     * 统一社会信用代码
     */
    private String fkSocialCode;

    /**
     * 企业名称
     */
    private String enterpriseName;

    /**
     * 金融产品名称
     */
    private String fkProductName;
    /**
     * 申请时间
     */
    private Date requestTime;


    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public String getFkSocialCode() {
        return fkSocialCode;
    }

    public void setFkSocialCode(String fkSocialCode) {
        this.fkSocialCode = fkSocialCode;
    }

    public String getFkProductName() {
        return fkProductName;
    }

    public void setFkProductName(String fkProductName) {
        this.fkProductName = fkProductName;
    }

    public Date getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }
}
