package com.qn.web.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * 房屋实体类
 * @author LLL
 * @date 2019/12/16 9:08
 */
@Table(name = "ims_amouse_wxapp_house")
@Data
public class House {

//`id` int(10) NOT NULL AUTO_INCREMENT,
//  `uniacid` int(10) NOT NULL,
//  `openid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
//  `avater` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
//  `nickname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
//  `mobile` varchar(18) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '手机号',
//            `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '房屋名称',
//            `code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
//  `is_person` tinyint(2) NULL DEFAULT 0 COMMENT '0:官方 1：个人',
//            `person_mobile` varchar(18) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '个人电话',
//            `price` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '单价',
//            `total_price` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '总价',
//            `rental` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '租金元/月',
//            `house_type` tinyint(2) NULL DEFAULT 0 COMMENT '0:出租 1：出售 2:求租3：求购',
//            `cash_type` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '押金类型',
//            `estate` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '小区名',
//            `video_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '视频链接',
//            `area_id` int(10) NOT NULL COMMENT '区域',
//            `type_id` int(10) NOT NULL COMMENT '户型',
//            `fit_id` int(10) NOT NULL COMMENT '装修情况',
//            `use_id` int(10) NOT NULL COMMENT '用途',
//            `shop_id` int(10) NOT NULL COMMENT '门店',
//            `vill_id` int(10) NOT NULL COMMENT '小区',
//            `view` int(10) NOT NULL DEFAULT 0 COMMENT '阅读量',
//            `age_id` int(10) NOT NULL COMMENT '年代',
//            `house_toward` int(10) NOT NULL COMMENT '方向',
//            `agent_id` int(10) NOT NULL COMMENT '经纪人',
//            `is_open_map` tinyint(1) NULL DEFAULT 1 COMMENT '0打开 1关闭',
//            `lat` decimal(18, 10) NOT NULL DEFAULT 31.9591530000 COMMENT '经度',
//            `lng` decimal(18, 10) NOT NULL DEFAULT 118.7512210000 COMMENT '纬度',
//            `house_area` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '面积',
//            `floor` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '楼层',
//            `desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//  `imgs` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
//            `vipstatus` tinyint(1) NOT NULL DEFAULT 0,
//            `listorder` int(10) NULL DEFAULT 0 COMMENT '排序',
//            `createtime` int(10) NOT NULL,
//  `status` tinyint(1) NULL DEFAULT 0 COMMENT '0表示未审核，1表示已审核，2表示禁用',
//            `sendcode` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '推送码',
//            `document_age` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '产证日期',
//            `house_age` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '建造年代',
//            `address_id` int(11) NOT NULL DEFAULT 1 COMMENT '地区',
//    PRIMARY KEY (`id`) USING BTREE,
//    INDEX `indx_weid`(`uniacid`) USING BTREE


    private Integer id;

    private Integer uniacid;

    private String openid;

    private String avater;

    private String nickname;

    private String mobile;

    private String title;

    private String code;

    @Column(name = "is_person")
    private Byte isPerson;

    @Column(name = "person_mobile")
    private String personMobile;

    private String price;

    @Column(name = "total_price")
    private String totalPrice;

    private String rental;

    @Column(name = "house_type")
    private Integer houseType;

    @Column(name = "cash_type")
    private String cashType;

    private String estate;

    @Column(name = "video_url")
    private String videoUrl;

    @Column(name = "area_id")
    private Integer areaId;

    @Column(name = "type_id")
    private Integer typeId;

    @Column(name = "fit_id")
    private Integer fitId;

    @Column(name = "use_id")
    private Integer useId;

    @Column(name = "shop_Id")
    private Integer shopId;

    @Column(name = "vill_Id")
    private Integer villId;

    private Integer view;

    @Column(name = "age_id")
    private Integer ageId;

    @Column(name = "house_toward")
    private Integer houseToward;

    @Column(name = "agent_id")
    private Integer agentId;

    @Column(name = "is_open_map")
    private Boolean isOpenMap;

    private BigDecimal lat;

    private BigDecimal lng;

    @Column(name = "house_area")
    private String houseArea;

    private String floor;

    private String desc;

    private String address;

    private Boolean vipstatus;

    private Integer listorder;

    //发布时间(时间戳)
    private Integer createtime;

    private Integer status;

    private String sendcode;

    @Column(name = "document_age")
    private String documentAge;

    @Column(name = "house_age")
    private String houseAge;

    @Column(name = "address_id")
    private Integer addressId;

    private String imgs;

    //经纪人
    private String broker;

    //经纪人电话
    private String brokerMobile;

    //所属区域
    private  String area;

    //装修情况
    private String fit;

    //户型
    private String apartment;







}
