package com.qn.web.house.vo.input;

import com.qn.web.common.BaseParam;
import lombok.Data;

/**
 * 房屋信息入参
 * @author LLL
 * @date 2019/12/16 9:04
 */
@Data
public class HouseManagerIn extends BaseParam {

    //关键字筛选
    private String keyword;

    //0:出租 1：出售 2:求租3：求购
    private Integer houseType;

}
