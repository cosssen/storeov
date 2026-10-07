package com.store.domain.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserDTO {

    /** 主键ID */
    private Long id;
    /** 用户名 */
    private String username;
    /** 头像URL */
    private String avatar;
    /** 角色：0普通用户 1管理员 */
    private Integer role;
    /** 创建时间 */
    private LocalDateTime createTime;
}
