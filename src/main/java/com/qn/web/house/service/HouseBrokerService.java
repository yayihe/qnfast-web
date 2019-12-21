package com.qn.web.house.service;

import com.qn.web.common.Result;
import com.qn.web.house.vo.input.HouseBrokerIn;

public interface HouseBrokerService {

    Result queryList(HouseBrokerIn paramIn);

    Result saveOrUpdate(HouseBrokerIn paramIn);

    Result delete(HouseBrokerIn paramIn);
}
