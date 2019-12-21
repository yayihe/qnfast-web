package com.qn.web.house.mapper;

import com.qn.web.common.CurdMapper;
import com.qn.web.entity.House;
import com.qn.web.house.vo.input.HouseManagerIn;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HouseManagerMapper extends CurdMapper<House> {

    List<House> queryList(@Param("paramIn") HouseManagerIn paramIn);

}
