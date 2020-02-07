package com.bdilib.smeserviceplatform.vo;

import lombok.Data;

/**
 * @author lr
 * @Package com.bdilib.smeserviceplatform.vo
 * @date 2020/1/30 17:50
 * @description 企业需求的相关信息
 */
@Data
public class DemandCheckVO {
    private int requirementId;
    /**
     *15位的自增字段，唯一标识一条记录
     */
    private String fkSocialCode;
    /**
     *统一社会信用代码，18位阿拉伯数字或大写英文字母
     */
    private String enterpriseName;
    /**
     *企业名称
     */
    private int  loanLimit;
    /**
     *贷款额度（单位：万元）
     *
     * 0-100万及以下
     *
     * 1-200万及以下
     *
     * 2-300万及以下
     *
     * 3-500万及以下
     *
     * 4-1000万及以下
     *
     * 5-1000万以上
     */
    private double rateLowerLimit;
    /**
     *利率下限（单位%）
     */
    private double rateUpperLimit;
    /**
     *利率上限（单位%）
     */
    private int loanPeriod;
    /**
     *贷款期限（单位：月）
     */
    private int guaranteeMode;
    /**
     *担保方式
     *
     * 0-抵押
     *
     * 1-信保基金
     *
     * 2-一般保证
     *
     * 3-信用
     *
     * 4-实际控制人夫妇提供个人连带担保
     */
    private int financingPurposes;
    /**
     *融资用途
     *
     * 0-企业厂房建设
     *
     * 1-购置设备等固定资产
     *
     * 2-增资扩产
     *
     * 3-融资租赁贷款
     *
     * 4-土地整理贷款
     *
     * 5-融资租赁贷款
     */
    private String projectSituation;
    /**
     *项目情况
     */
    private String remark;
    /**
     *备注
     */
    public String getFkSocialCode() {
        return fkSocialCode;
    }

    public void setFkSocialCode(String fkSocialCode) {
        this.fkSocialCode = fkSocialCode;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }
}
