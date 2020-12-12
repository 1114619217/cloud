package com.cloud.user.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author cgf
 * @since 2020-12-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_user")
public class User implements Serializable {

    private static final long serialVersionUID = 7038020936330877243L;
    /**
     * 会员ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 登陆名
     */
    private String loginName;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 登陆密码
     */
    private String password;

    /**
     * 注册时间
     */
    private Date createTime;

    /**
     * 0代表女，1代表男
     */
    private Integer sex;

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 上次登陆时间
     */
    private Date lastLogin;

    /**
     * 登陆次数
     */
    private Integer loginCount;

    /**
     * 注册IP地址
     */
    private String createIp;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 状态
     */
    private Integer disabled;


}
