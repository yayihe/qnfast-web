package com.qn.web.common;

import lombok.Data;

/**
 * 返回结果集
 * @param <T>
 * @author LLL
 */
@Data
public class Result<T>{

    private String code;
    private String msg;
    private T data;

    /**
     *  成功时候的调用
     * */
    public static  <T> Result<T> success(T data){
        return new Result<T>(CodeMsg.SUCCESS,data);
    }

    /**
     *  失败时候的调用
     * */
    public static  <T> Result<T> error(CodeMsg codeMsg){
        return new Result<T>(codeMsg);
    }

    private Result(T data) {
        this.data = data;
    }

    private Result(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private Result(CodeMsg codeMsg) {
        if(codeMsg != null) {
            this.code = codeMsg.getCode();
            this.msg = codeMsg.getMsg();
        }
    }

    private Result(CodeMsg codeMsg,T data) {
        if(codeMsg != null) {
            this.code = codeMsg.getCode();
            this.msg = codeMsg.getMsg();
            this.data = data;
        }
    }





}
