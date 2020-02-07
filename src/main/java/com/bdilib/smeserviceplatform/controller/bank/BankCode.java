package com.bdilib.smeserviceplatform.controller.bank;

/**
 * @author lr
 * @Package com.bdilib.smeserviceplatform.controller.bank
 * @date 2020/1/31 14:54
 * @description
 */
    public enum  BankCode {
        LOGINSUCCESS("1000","金融机构用户登录成功"),
        USERNAME_NULL("1001","用户名不存在,请注册"),
        PASSWORD_WRONG("1002","密码错误"),
        CHENCK_FAILED("1003","查询失败"),
        CHECK_SUCCESS("1004","查询成功"),
        RELEASE_SUCCESS("1005","发布成功"),
        RELEASE_FAILED("1006","发布失败"),
        REGISTER_SUCCESS("1007","金融机构用户注册成功"),
        REGISTER_FAIL_BANKID("1008","用户已存在"),
        REGISTER_FAIL_USERNAME("1009","用户名已存在"),
        PRODUCT_APPLY_SUCCESS("1010","查看成功"),
        PRODUCT_APPLY_FAILED("1011","查看失败");

    private String code;
        private String message;

        BankCode(String code, String message){
            this.code = code;
            this.message = message;
        }

        public void setCode(String code){ this.code = code; }
        public String getCode(){ return this.code; };

        public void setMessage(String message){ this.message = message; }
        public String getMessage(){ return this.message; }
    }

