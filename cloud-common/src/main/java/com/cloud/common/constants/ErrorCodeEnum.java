package com.cloud.common.constants;

/**
 * Created by user on 2020/12/03.
 */
public enum ErrorCodeEnum {

    SUCCESS("0", "success"),
    FAIL("-1", "FAIL"),
    UNKNOWN_ERROR("100001", "系统异常,请稍后重试"),
    INVALID_REQUEST_PARAMETER("100002", "该商品不存在"),
    FEIGN_FAIL_CALLBACK("100003", "feign调用异常"),
    GATEWAY_FUSING_DEMOTION("100004", "网关熔断降级"),
    AGENT_ERROR_DISABLED("100005", "代理商已禁用"),
    PARAMETER_ERROR_FAIL("100006", "参数异常"),
    USER_INFO_FAIL("100007", "请求头参数信息不能为空"),
    LOGIN_FAIL("100008", "登录出现异常"),
    CHECK_SGIN_FAIL("100009", "签名错误"),
    TRADE_SN_NOT_NULL("100010", "tradeSn为空"),
    TRADE_NOT_EXIST("100011", "交易表信息不存在"),
    ORDER_NOT_EXIST("100012", "订单信息不存在"),
    LOGI_COMPANY_NOT_EXIST("100013", "物流公司信息不存在"),
    LOGI_INFO_NOT_EXIST("100014", "暂无物流信息"),
    ORDER_NOT_APPLY_REFUND("100015", "该订单不能申请退款"),
    REFUND_APPLY_FAIL("100016", "退款申请失败"),
    GET_PHONE_FAIL("100017", "获取店铺联系方式失败"),
    SYSTEM_PARAMETER_ERROR("100018", "请检查系统参数配置"),
    SKU_ENABLE_QUANTITY_FAIL("100019", "sku返还库存失败"),
    GOODS_ENABLE_QUANTITY_FAIL("100020", "商品返还库存失败"),
    REFUND_NOT_EXIST("100021", "退款信息不存在"),
    REFUND_STATUS_EXCEPTION("100022", "退款状态异常,请联系运营人员"),
    NO_PERMISSION("100023", "没有权限"),
    NO_COMMENT("100024", "该订单不能评论"),
    COMMENT_PARAM_ERROR("100025", "没有相应的规格的商品"),
    NOT_GOOD_GRADE("100026", "非好评必填评论内容!!"),
    GOODS_NOT_EXIST("100027", "商品不存在"),
    RETURN_NUM_ERROR("100028", "退货数量与购买数量不符"),
    ORDER_PAY_VALID_ERROR("100029", "退款金额不能大于订单金额"),
    LOGIN_MERCHANT_FAIL("100030", "登录失败"),
    ANTHENTICATION_FAIL("110005", "鉴权失败"),
    LOGIN_OUT("110006", "登陆过期");

    private final String errorCode;
    private final String errorMsg;

    ErrorCodeEnum(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }
}
