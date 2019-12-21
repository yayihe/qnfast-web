package com.qn.web.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "role")
public class Role {

    @Column(name = "roleId")
    private Integer roleId;
    @Column(name = "roleName")
    private String roleName;
    //DelegatedAdministration 委托管理
    //OperationManagement 运维管理
    //competence

}
