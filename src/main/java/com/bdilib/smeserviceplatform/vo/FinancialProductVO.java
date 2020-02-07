package com.bdilib.smeserviceplatform.vo;

import lombok.Data;

/**
 * @author lr
 * @Package com.bdilib.smeserviceplatform.vo
 * @date 2020/2/2 12:04
 * @description 金融产品发布相关信息
 */
@Data
public class FinancialProductVO {
    private String productName;
    /**
     * 金融产品名称
     */
    private  int fkBankId;
    /**
     * 银行行号
     */

    /**
     *
     */
    private String bankName;
    /**
     *银行名称
     */
    private int institutionType;
    /**
     *机构类型：
     *
     * 0-银行
     *
     * 1-担保公司
     *
     * 2-保险公司
     *
     * 3-交易所
     *
     * 4-金融租赁
     *
     * 5-转贷公司
     *
     * 6-服务公司
     */
    private double rateLowerLimit;
    /**
     *利率下限（单位%）
     */
    private double rateUpperLimit;
    /**
     *利率上限（单位%）
     */
    private int generality;
    /**
     *通用产品
     *
     * 0-非通用产品
     *
     * 1-通用产品
     */
    private int internetLoanType;
    /**
     *网贷直联
     *
     * 0-非网贷直联
     *
     * 1-网贷直联
     */
    private int productProperties;
    /**
     *政策性产品
     *
     * 0-非政策性产品
     *
     * 1-政策性产品
     */
    private int paymentType;
    /**
     *支付方式
     *
     * 0-非人民币
     *
     * 1-人民币
     */
    private int loanType;
    /**
     *贷款类别:
     *
     * 0-经营贷款
     *
     * 1-流动资金贷款
     *
     * 2-周转贷款
     */
    private int loanLimit;
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
    private int loanPeriod;
    /**
     *贷款期限（单位：月）
     */
    private int guaranteeMode;
    /**
     *担保方式:
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
    private String useArea;
    /**
     *使用区域
     */
    private String description;

/**
 *说明
 */
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getFkBankId() {
        return fkBankId;
    }

    public void setFkBankId(int fkBankId) {
        this.fkBankId = fkBankId;
    }

    public int getInstitutionType() {
        return institutionType;
    }

    public void setInstitutionType(int institutionType) {
        this.institutionType = institutionType;
    }

    public double getRateLowerLimit() {
        return rateLowerLimit;
    }

    public void setRateLowerLimit(double rateLowerLimit) {
        this.rateLowerLimit = rateLowerLimit;
    }

    public double getRateUpperLimit() {
        return rateUpperLimit;
    }

    public void setRateUpperLimit(double rateUpperLimit) {
        this.rateUpperLimit = rateUpperLimit;
    }

    public int getGenerality() {
        return generality;
    }

    public void setGenerality(int generality) {
        this.generality = generality;
    }

    public int getInternetLoanType() {
        return internetLoanType;
    }

    public void setInternetLoanType(int internetLoanType) {
        this.internetLoanType = internetLoanType;
    }

    public int getProductProperties() {
        return productProperties;
    }

    public void setProductProperties(int productProperties) {
        this.productProperties = productProperties;
    }

    public int getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(int paymentType) {
        this.paymentType = paymentType;
    }

    public int getLoanType() {
        return loanType;
    }

    public void setLoanType(int loanType) {
        this.loanType = loanType;
    }

    public int getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(int loanLimit) {
        this.loanLimit = loanLimit;
    }

    public int getLoanPeriod() {
        return loanPeriod;
    }

    public void setLoanPeriod(int loanPeriod) {
        this.loanPeriod = loanPeriod;
    }

    public int getGuaranteeMode() {
        return guaranteeMode;
    }

    public void setGuaranteeMode(int guaranteeMode) {
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
