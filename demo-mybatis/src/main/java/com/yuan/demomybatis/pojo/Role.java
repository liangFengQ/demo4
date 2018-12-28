package com.yuan.demomybatis.pojo;

import com.yuan.demomybatis.commons.pojo.BasePojo;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role extends BasePojo {
    private String name;

    @Builder
    public Role(String id, String createUser, String updateUser, Date createDate, Date updateDate, String name) {
        super(id, createUser, updateUser, createDate, updateDate);
        this.name = name;
    }
}
