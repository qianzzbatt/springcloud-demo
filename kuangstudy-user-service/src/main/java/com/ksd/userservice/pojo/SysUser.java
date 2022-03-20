package com.ksd.userservice.pojo;

import com.baomidou.mybatisplus.annotation.*;
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
@TableName("kss_user")
public class SysUser implements java.io.Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    /**
     * 发布状态
     */
    private Integer status;
    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
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