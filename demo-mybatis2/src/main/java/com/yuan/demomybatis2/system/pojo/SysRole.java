package com.yuan.demomybatis2.system.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.yuan.demomybatis2.commons.pojo.BasePojo;
import lombok.*;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@TableName("sys_role")
@NoArgsConstructor
@AllArgsConstructor
public class SysRole extends BasePojo {
    @NotEmpty(message = "角色名称不能为空")
    private String name;

    @Builder
    public SysRole(String id, String createUser, String updateUser, Date createDate, Date updateDate, String name) {
        super(id, createUser, updateUser, createDate, updateDate);
        this.name = name;
    }
}
