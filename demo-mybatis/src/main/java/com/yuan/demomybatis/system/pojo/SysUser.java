package com.yuan.demomybatis.system.pojo;

import com.yuan.demomybatis.commons.pojo.BasePojo;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "sys_user")
public class SysUser extends BasePojo {
    private String username;//账户名
    private String name;//用户名
    private String password;//密码
    @Column(name = "is_del")
    private Integer isDel;

    @Builder
    public SysUser(String id, Date createDate, Date updateDate, String createUser, String updateUser, String username, String name, String password, Integer isDel) {
        super(id, createDate, updateDate, createUser, updateUser);
        this.username = username;
        this.name = name;
        this.password = password;
        this.isDel = isDel;
    }
}
