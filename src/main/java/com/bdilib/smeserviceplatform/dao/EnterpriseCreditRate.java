package com.bdilib.smeserviceplatform.dao;

import lombok.Data;

import java.util.Date;
@Data
public class EnterpriseCreditRate {
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

}