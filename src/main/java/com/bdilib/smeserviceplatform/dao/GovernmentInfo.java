package com.bdilib.smeserviceplatform.dao;

import lombok.Data;

@Data
public class GovernmentInfo {
    /**
     * 32位的自增字段，唯一标识一条记录
     */
    private int id;
    /**
     * 用户id
     */
    private int fkUserId;
    /**
     * 政府编码
     */
    private Integer governmentCode;

    /**
     *政府部门名称
     */
    private String departmentName;

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
     *政府部门负责人姓名
     */
    private String principalName;

    /**
     *政府部门负责人手机号
     */
    private String principalPhone;

}