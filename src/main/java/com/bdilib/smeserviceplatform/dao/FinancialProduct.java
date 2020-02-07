package com.bdilib.smeserviceplatform.dao;

import io.swagger.models.auth.In;
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
    private Integer institutionType;

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
    private Integer generality;

    /**
     *网贷直联
     * 0-非网贷直联
     * 1-网贷直联
     */
    private Integer internetLoanType;

    /**
     *政策性产品
     * 0-非政策性产品
     * 1-政策性产品
     */
    private Integer productProperties;

    /**
     *支付方式
     * 0-非人民币
     * 1-人民币
     */
    private Integer paymentType;

    /**
     *贷款类别:
     * 0-经营贷款
     * 1-流动资金贷款
     * 2-周转贷款
     */
    private Integer loanType;

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
    private Integer guaranteeMode;

    /**
     *使用区域
     */
    private String useArea;

    /**
     *说明
     */
    private String description;

    public Integer getFkUserId() {
        return fkUserId;
    }

    public void setFkUserId(Integer fkUserId) {
        this.fkUserId = fkUserId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getInstitutionType() {
        return institutionType;
    }

    public void setInstitutionType(Integer institutionType) {
        this.institutionType = institutionType;
    }

    public Double getRateLowerLimit() {
        return rateLowerLimit;
    }

    public void setRateLowerLimit(Double rateLowerLimit) {
        this.rateLowerLimit = rateLowerLimit;
    }

    public Double getRateUpperLimit() {
        return rateUpperLimit;
    }

    public void setRateUpperLimit(Double rateUpperLimit) {
        this.rateUpperLimit = rateUpperLimit;
    }

    public Integer getGenerality() {
        return generality;
    }

    public void setGenerality(Integer generality) {
        this.generality = generality;
    }

    public Integer getInternetLoanType() {
        return internetLoanType;
    }

    public void setInternetLoanType(Integer internetLoanType) {
        this.internetLoanType = internetLoanType;
    }

    public Integer getProductProperties() {
        return productProperties;
    }

    public void setProductProperties(Integer productProperties) {
        this.productProperties = productProperties;
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public Integer getLoanType() {
        return loanType;
    }

    public void setLoanType(Integer loanType) {
        this.loanType = loanType;
    }

    public Integer getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Integer loanLimit) {
        this.loanLimit = loanLimit;
    }

    public Integer getLoanPeriod() {
        return loanPeriod;
    }

    public void setLoanPeriod(Integer loanPeriod) {
        this.loanPeriod = loanPeriod;
    }

    public Integer getGuaranteeMode() {
        return guaranteeMode;
    }

    public void setGuaranteeMode(Integer guaranteeMode) {
        this.guaranteeMode = guaranteeMode;
    }

    public String getUseArea() {
        return useArea;
    }

    public void setUseArea(String useArea) {
        this.useArea = useArea;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}