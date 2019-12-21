package com.qn.web.house.vo.output;

import com.qn.web.common.BaseParam;
import com.qn.web.common.PageVo;
import lombok.Data;

import java.io.Serializable;

/**
 * 经纪人出参
 * @author LLL
 * @date 2019/12/17 13:31
 */
@Data
public class HouseBrokerOut{

    //经纪人名称
    private String realname;

    //所在门店
    private String shop;

    //电话
    private String mobile;

    //状态 0表示已审核，1表示未审核，2表示禁用
    private Byte status;

    //门店地址
    private String address;

    //头像路径
    private String iconUrl;


}
