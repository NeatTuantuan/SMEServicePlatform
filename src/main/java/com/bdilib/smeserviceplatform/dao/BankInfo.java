package com.bdilib.smeserviceplatform.dao;

import lombok.Data;

@Data
public class BankInfo{
    /**
     * 32位的自增字段，唯一标识一条记录
     */
    private int id;
    /**
     * 用户id
     */
    private Integer fkUserId;
    /**
     * 银行行号
     */
    private int bankId;
    /**
     * 银行名称
     */
    private String bankName;
    /**
     *所属区域：
     * 0-沣东新城
     * 1-沣西新城
     * 2-泾河新城
     * 3-空港新城
     * 4-秦汉新城
     */
    private int region;
    /**
     *联系人姓名
     */
    private String contactName;
    /**
     * 联系人手机号
     */
    private String contactPhone;

}