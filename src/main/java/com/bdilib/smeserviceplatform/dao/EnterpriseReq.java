package com.bdilib.smeserviceplatform.dao;

import lombok.Data;

@Data
public class EnterpriseReq{
    /**
     *32位的自增字段，唯一标识一条记录
     */
    private Integer id;

    /**
     *用户id
     */
    private Integer fkUserId;

    /**
     *贷款额度（单位：万元）
     * 0-100万及以下
     * 1-200万及以下
     * 2-300万及以下
     * 3-500万及以下
     * 4-1000万及以下
     * 5-1000万以上
     */
    private Integer loanLimit;

    /**
     *利率下限（单位%）
     */
    private Double rateLowerLimit;

    /**
     *利率上限（单位%）
     */
    private Double rateUpperLimit;

    /**
     *贷款期限（单位：月）
     */
    private Integer loanPeriod;

    /**
     *担保方式
     * 0-抵押
     * 1-信保基金
     * 2-一般保证
     * 3-信用
     * 4-实际控制人夫妇提供个人连带担保
     */
    private Integer guaranteeMode;

    /**
     *融资用途
     * 0-企业厂房建设
     * 1-购置设备等固定资产
     * 2-增资扩产
     * 3-融资租赁贷款
     * 4-土地整理贷款
     * 5-融资租赁贷款
     */
    private Integer financingPurposes;

    /**
     *项目情况
     */
    private String projectSituation;

    /**
     *备注
     */
    private String remark;
}