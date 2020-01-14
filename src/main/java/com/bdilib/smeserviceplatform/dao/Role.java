package com.bdilib.smeserviceplatform.dao;

import lombok.Data;

@Data
public class Role {
    /**
     *32位的自增字段，唯一标识一条记录
     */
    private Integer id;

    /**
     *权限名
     */
    private String roleName;

    /**
     *权限描述
     */
    private String desc;
}