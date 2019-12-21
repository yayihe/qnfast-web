package com.qn.web.house.vo.output;

import com.qn.web.common.PageVo;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 房屋信息出参
 * @author LLL
 * @date 2019/12/16 9:05
 */
@Data
public class HouseManagerOut{

    private static final long serialVersionUID = 1L;

    //房屋id
    private Integer id;

    //区域
    private String area;

    //装修情况
    private String fit;

    //户型
    private String apartment;

    //0:出租 1：出售 2:求租3：求购
    private Integer houseType;

    //经纪人姓名
    private String broker;

    //经纪人电话
    private String brokerMobile;

    //状态 0表示未审核，1表示已审核，2表示禁用
    private Integer status;

    //发布时间(字符串日期格式)
    private String createTime;




}
