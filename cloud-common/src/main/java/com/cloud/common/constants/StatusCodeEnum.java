package com.cloud.common.constants;

/**
 * Created by user on 2020/12/03.
 */
public enum StatusCodeEnum {

    UNKNOWN_ERROR(0, "Unknown error"),

    SUCCESS(1, "success"),

    FAIL(-1,"fail");

    private final Integer code;

    private final String msg;

    StatusCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
