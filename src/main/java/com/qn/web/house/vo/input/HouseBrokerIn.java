package com.qn.web.house.vo.input;

import com.qn.web.common.BaseParam;
import lombok.Data;

/**
 * 经纪人管理入参
 * @author LLL
 * @date 2019/12/17 12:00
 */
@Data
public class HouseBrokerIn extends BaseParam {

    //电话号码或姓名
    private String mobileOrName;

    //电话号码或姓名
    private String ids;

    //0为添加 , 1为修改
    private String isSave;

    //门店id
    private String shopId;

    //地区id
    private String addressId;
    //真实姓名
//    private String name;


}
