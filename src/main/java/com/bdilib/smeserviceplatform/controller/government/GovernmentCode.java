package com.bdilib.smeserviceplatform.controller.government;

public enum GovernmentCode {
    LOGINS_SUCCESS("3000","政府用户登录成功"),
    USERNAME_NULL("3001","用户名不存在,请注册"),
    PASSWORD_WRONG("3002","密码错误"),
    REGISTER_FAIL_USERNAME("3003","用户名已存在"),
    REGISTER_FAIL_GOVERNMENTCODE("3004","该用户已注册"),
    REGISTER_SUCCEESS("3005","注册成功"),
    CREDIT_RATING_SUCCESS("3006","评级成功"),
    NAME_REQ_SUCCESS("3007","请求成功");


    private String code;
    private String message;

    GovernmentCode(String code, String message){
        this.code = code;
        this.message = message;
    }

    public void setCode(String code){ this.code = code; }
    public String getCode(){ return this.code; };

    public void setMessage(String message){ this.message = message; }
    public String getMessage(){ return this.message; }
}
