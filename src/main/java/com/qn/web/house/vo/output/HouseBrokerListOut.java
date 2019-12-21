package com.qn.web.house.vo.output;

import com.qn.web.common.BaseParam;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author LLL
 * @date 2019/12/17 15:02
 */
@Data
public class HouseBrokerListOut extends BaseParam implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<HouseBrokerOut> brokerOuts;

}
