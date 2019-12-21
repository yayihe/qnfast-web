package com.qn.web.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author LLL
 * @date 2019/12/11 14:12
 */
@Table(name = "ims_users")
@Data
public class User {

    private Integer uId;
    @Column(name = "owner_uid")
    private Integer owneruId;
    private Integer groupId;
    @Column(name = "founder_groupid")
    private Integer founderGroupId;
    private String userName;
    private String passWord;
    private String salt;
    private int type;
    private int status;
    private Date joinDate;
    private String joinIp;
    private Integer lastVisit;
    private String lastIp;
    private String remake;
    private Date startTime;
    private Date endTime;
    @Column(name = "register_type")
    private int refisterType;
    private String openId;

}
