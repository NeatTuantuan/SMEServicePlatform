package com.bdilib.smeserviceplatform.dao;

import lombok.Data;

import java.util.Date;

@Data
public class EnterpriseInfo {
    /**
     *32位的自增字段，唯一标识一条记录
     */
    private Integer id;

    /**
     *用户id
     */
    private Integer fkUserId;

    /**
     *统一社会信用代码，18位阿拉伯数字或大写英文字母
     */
    private String socialCode;

    /**
     *企业名称
     */
    private String enterpriseName;

    /**
     *企业注册资本（单位：万元）
     */
    private Integer registeredCapital;

    /**
     *法人姓名
     */
    private String ownerName;

    /**
     *所属区域：
     * 0-沣东新城
     * 1-沣西新城
     * 2-泾河新城
     * 3-空港新城
     * 4-秦汉新城
     */
    private Byte region;

    /**
     *法定代表人手机号码
     */
    private String ownerPhone;

    /**
     *联系人姓名
     */
    private String contactName;

    /**
     *联系人手机号
     */
    private String contactPhone;

    /**
     *成立时间（yyyy-mm-dd）
     */
    private Date establishTime;

    /**
     *注册地址
     */
    private String establishAddress;

    /**
     *信保基金额度（单位：万元）
     */
    private Integer fundQuota;

    /**
     *可用额度（单位：万元）
     */
    private Integer available;

    /**
     *经营范围
     */
    private String businessScope;
}