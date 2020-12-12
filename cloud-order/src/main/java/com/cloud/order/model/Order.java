package com.cloud.order.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 订单表
 * </p>
 *
 * @author cgf
 * @since 2020-12-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_order")
public class Order implements Serializable {


    private static final long serialVersionUID = -1089797190328078159L;
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 会员ID
     */
    private String userId;

    /**
     * 用户手机号码
     */
    private String mobile;

    /**
     * 状态 1待支付 2处理中 3 成功 4 失败  5 已取消 6退款中 7已退款 8部分退款 9部分支付  10 已使用
     */
    private Integer status;

    /**
     * 金额（单位 ：元）
     */
    private BigDecimal amount;

    /**
     * 购买数量
     */
    private Integer count;

    /**
     * 0积分支付 1 微信 2 支付宝 3.银联 
     */
    private Integer payType;

    /**
     * 产品id
     */
    private Integer productId;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;

    /**
     * 支付参数
     */
    private String payParam;

    /**
     * 支付时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date payTime;


}
