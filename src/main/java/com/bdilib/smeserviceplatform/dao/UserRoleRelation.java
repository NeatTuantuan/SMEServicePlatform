package com.bdilib.smeserviceplatform.dao;

import lombok.Data;

@Data
public class UserRoleRelation {
    /**
     *32位的自增字段，唯一标识一条记录
     */
    private Integer id;

    /**
     *用户id
     */
    private Integer fkUserId;

    /**
     *权限id
     */
    private Integer fkRoleId;
}