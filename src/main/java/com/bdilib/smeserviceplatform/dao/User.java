package com.bdilib.smeserviceplatform.dao;

import lombok.Data;

@Data
public class User {
    /**
     *32位的自增字段，唯一标识一条记录
     */
    private Integer id;

    /**
     *用户名
     */
    private String userName;

    /**
     *密码
     */
    private String password;
}