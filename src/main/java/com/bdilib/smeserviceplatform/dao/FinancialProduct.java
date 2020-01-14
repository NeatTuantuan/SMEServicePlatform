package com.bdilib.smeserviceplatform.dao;

import lombok.Data;

@Data
public class FinancialProduct{
    /**
     * 32位的自增字段，唯一标识一条记录
     */
    private int id;
    /**
     * 金融产品名称
     */
    private String productName;
    /**
     *用户id
     */
    private Integer fkUserId;

    /**
     *机构类型：
     * 0-银行
     * 1-担保公司
     * 2-保险公司
     * 3-交易所
     * 4-金融租赁
     * 5-转贷公司
     * 6-服务公司
     */
    private Byte institutionType;

    /**
     *利率下限（单位%）
     */
    private Double rateLowerLimit;

    /**
     *利率上限（单位%）
     */
    private Double rateUpperLimit;

    /**
     *通用产品
     * 0-非通用产品
     * 1-通用产品
     */
    private Boolean generality;

    /**
     *网贷直联
     * 0-非网贷直联
     * 1-网贷直联
     */
    private Boolean internetLoanType;

    /**
     *政策性产品
     * 0-非政策性产品
     * 1-政策性产品
     */
    private Boolean productProperties;

    /**
     *支付方式
     * 0-非人民币
     * 1-人民币
     */
    private Boolean paymentType;

    /**
     *贷款类别:
     * 0-经营贷款
     * 1-流动资金贷款
     * 2-周转贷款
     */
    private Byte loanType;

    /**
     *贷款额度（单位：万元）
     * 0-100万及以下
     * 1-200万及以下
     * 2-300万及以下
     * 3-500万及以下
     * 4-1000万及以下
     * 5-1000万以上
     */
    private Byte loanLimit;

    /**
     *贷款期限（单位：月）
     */
    private Integer loanPeriod;

    /**
     *担保方式:
     * 0-抵押
     * 1-信保基金
     * 2-一般保证
     * 3-信用
     * 4-实际控制人夫妇提供个人连带担保
     */
    private Byte guaranteeMode;

    /**
     *使用区域
     */
    private String useArea;

    /**
     *说明
     */
    private String description;

}