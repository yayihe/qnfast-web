package com.qn.web.common;

import lombok.Data;

/**
 * 返回码
 * @author LLL
 */
@Data
public class CodeMsg {

    private String code;
    private String msg;

    //通用的返回码
    public static CodeMsg SUCCESS = new CodeMsg("001", "success");
    public static CodeMsg SERVER_ERROR = new CodeMsg("002", "服务端异常");
    public static CodeMsg BIND_ERROR = new CodeMsg("003", "参数异常");
    public static CodeMsg REQUEST_ILLEGAL = new CodeMsg("004", "请求非法");
    public static CodeMsg ACCESS_LIMIT_REACHED= new CodeMsg("005", "访问太频繁！");
    public static CodeMsg BIND_ISEMIPTY = new CodeMsg("006", "参数为空");
    public static CodeMsg ERROR = new CodeMsg("500", "程序异常");
    public static CodeMsg PASSWORD_ERROR = new CodeMsg("500215", "用户名或密码错误");

    //登录模块 5002XX
    public static CodeMsg SESSION_ERROR = new CodeMsg("500210", "");
    public static CodeMsg PASSWORD_EMPTY = new CodeMsg("500211", "");
    public static CodeMsg MOBILE_EMPTY = new CodeMsg("500212", "");
    public static CodeMsg MOBILE_ERROR = new CodeMsg("500213", "");
    public static CodeMsg MOBILE_NOT_EXIST = new CodeMsg("500214", "");


    private CodeMsg( ) {
    }
    private CodeMsg( String code,String msg ) {
        this.code = code;
        this.msg = msg;
    }

    public CodeMsg fillArgs(Object... args) {
        String code = this.code;
        String message = String.format(this.msg, args);
        return new CodeMsg(code, message);
    }

    //重写object的tostring()方法
    @Override
    public String toString() {
        return "CodeMsg [code=" + code + ", msg=" + msg + "]";
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
