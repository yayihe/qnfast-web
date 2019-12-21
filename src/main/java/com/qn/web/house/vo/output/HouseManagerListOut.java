package com.qn.web.house.vo.output;

import com.qn.web.common.BaseParam;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author LLL
 * @date 2019/12/17 14:46
 */
@Data
public class HouseManagerListOut extends BaseParam implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<HouseManagerOut> managerOuts;

}
