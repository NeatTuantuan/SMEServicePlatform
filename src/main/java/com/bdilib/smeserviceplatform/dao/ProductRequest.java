package com.bdilib.smeserviceplatform.dao;

import lombok.Data;

import java.util.Date;

@Data
public class ProductRequest {
    /**
     *32位的自增字段，唯一标识一条记录
     */
    private Integer id;
    /**
     * 用户id
     */
    private Integer fkUserId;

    /**
     * 金融产品id
     */
    private Integer fkProductId;

    /**
     * 申请时间
     */
    private Date requestTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFkUserId() {
        return fkUserId;
    }

    public void setFkUserId(Integer fkUserId) {
        this.fkUserId = fkUserId;
    }

    public Integer getFkProductId() {
        return fkProductId;
    }

    public void setFkProductId(Integer fkProductId) {
        this.fkProductId = fkProductId;
    }

    public Date getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }
}
