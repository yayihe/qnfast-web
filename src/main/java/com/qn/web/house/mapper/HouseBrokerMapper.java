package com.qn.web.house.mapper;

import com.qn.web.common.CurdMapper;
import com.qn.web.entity.Broker;
import com.qn.web.house.vo.input.HouseBrokerIn;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HouseBrokerMapper extends CurdMapper<Broker> {

    List<Broker> queryList(@Param("mobileOrName") String mobileOrName);

    int batchdelete(@Param("ids") String ids);

    int save(@Param("broker")Broker broker);

    int update(@Param("broker")Broker broker);
}
