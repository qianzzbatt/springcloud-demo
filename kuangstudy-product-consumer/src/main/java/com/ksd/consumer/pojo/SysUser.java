package com.ksd.consumer.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


/**
 * todo:用户管理
 *
 * @author A
 * @version 1.0.0<br />
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysUser implements java.io.Serializable {
    /**
     * 主键
     */
    private Long id;
    /**
     * 发布状态
     */
    private Integer status;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 头像
     */
    private String avatar;
    /**
     * 性别
     */
    private Integer male;
    /**
     * 电话
     */
    private String telephone;
    /**
     * 身份证
     */
    private String idcard;
    /**
     * 微信openid
     */
    private String openid;
}