package com.qn.web.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * 经纪人实体类
 * @author LLL
 * @date 2019/12/17 11:24
 */
@Data
@Table(name = "ims_amouse_wxapp_agent")
public class Broker {

    private Integer id;

    private Integer uniacid;

    private String realname;

    @Column(name = "icon_url")
    private String iconUrl;

    private String mobile;

    private String openid;

    private Boolean vip;

    @Column(name = "shop_id")
    private Integer shopId;

    private Integer createtime;

    private Byte status;

    private String desc;

    private String sendcode;

    @Column(name = "address_id")
    private Integer addressId;

    //所在门店
    private String shop;

    //门店地址
    private String address;


}
