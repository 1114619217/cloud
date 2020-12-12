package com.cloud.common.model;

import com.cloud.common.constants.ErrorCodeEnum;
import com.cloud.common.constants.StatusCodeEnum;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;

/**
 * Created by user on 2020/5/22.
 */
@Data
@Validated
public class Result<T> implements Serializable {

    private static final long serialVersionUID = -9020014587185721452L;
    /**
     * 状态码 0：未知错误 1：成功 -1 失败
     */
    private Integer code;

    /**
     * 消息
     */
    private String msg;

    /**
     * 错误码
     */
    private String errorCode;


    /**
     * 错误消息
     */
    private String errorMsg;

    /**
     * 数据
     */
    private T data;

    public Result(StatusCodeEnum statusCodeEnum, ErrorCodeEnum errorCodeEnum, T data) {
        this.code = statusCodeEnum.getCode();
        this.msg = statusCodeEnum.getMsg();
        this.errorCode = errorCodeEnum.getErrorCode();
        this.errorMsg = errorCodeEnum.getErrorMsg();
        this.data = data;
    }

    public Result() {

    }

    public Result(Exception ex) {
        this.code = StatusCodeEnum.FAIL.getCode();
        this.msg = StatusCodeEnum.FAIL.getMsg();
        this.errorCode = StatusCodeEnum.FAIL.getCode().toString();
        this.errorMsg = ex.getMessage();
    }

    public Result(Throwable th) {
        this.code = StatusCodeEnum.FAIL.getCode();
        this.msg = StatusCodeEnum.FAIL.getMsg();
        this.errorCode = ErrorCodeEnum.FEIGN_FAIL_CALLBACK.getErrorCode();
        this.errorMsg = ErrorCodeEnum.FEIGN_FAIL_CALLBACK.getErrorMsg() + " " + th.getMessage();
    }

    public Result(StatusCodeEnum statusCodeEnum, ErrorCodeEnum errorCodeEnum, String msg, T data) {
        this.code = statusCodeEnum.getCode();
        this.msg = msg;
        this.data = data;
        this.errorCode = errorCodeEnum.getErrorCode();
        this.errorMsg = msg;
    }

    public static Result success() {
        Result res = new Result();
        res.setCode(StatusCodeEnum.SUCCESS.getCode());
        res.setMsg(StatusCodeEnum.SUCCESS.getMsg());
        return res;
    }

    public static Result success(Object t) {
        Result res = new Result();
        res.setCode(StatusCodeEnum.SUCCESS.getCode());
        res.setMsg(StatusCodeEnum.SUCCESS.getMsg());
        res.setData(t);
        return res;
    }

    public static Result fail() {
        Result res = new Result();
        res.setCode(StatusCodeEnum.FAIL.getCode());
        res.setMsg(StatusCodeEnum.FAIL.getMsg());
        return res;
    }


    public static Result fail(String msg) {
        Result res = new Result();
        res.setCode(StatusCodeEnum.FAIL.getCode());
        res.setMsg(msg);
        return res;
    }

    public static Result fail(ErrorCodeEnum errorCodeEnum) {
        Result res = new Result();
        res.setCode(StatusCodeEnum.FAIL.getCode());
        res.setMsg(StatusCodeEnum.FAIL.getMsg());
        res.setErrorCode(errorCodeEnum.getErrorCode());
        res.setErrorMsg(errorCodeEnum.getErrorMsg());
        return res;
    }
}
