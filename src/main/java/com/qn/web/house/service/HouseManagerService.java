package com.qn.web.house.service;

import com.qn.web.common.Result;
import com.qn.web.house.vo.input.HouseManagerIn;
import com.qn.web.house.vo.input.saveOrUpdateHouseIn;

public interface HouseManagerService {

    Result queryList(HouseManagerIn paramIn);

    Result saveOrUpdate(saveOrUpdateHouseIn paramIn);

}
