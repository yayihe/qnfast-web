package com.qn.web.house.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qn.web.common.CodeMsg;
import com.qn.web.common.DateUtils;
import com.qn.web.common.Result;
import com.qn.web.entity.House;
import com.qn.web.house.mapper.HouseManagerMapper;
import com.qn.web.house.service.HouseManagerService;
import com.qn.web.house.vo.input.HouseManagerIn;
import com.qn.web.house.vo.input.saveOrUpdateHouseIn;
import com.qn.web.house.vo.output.HouseManagerListOut;
import com.qn.web.house.vo.output.HouseManagerOut;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 房源管理业务类
 * @author LLL
 * @date 2019/12/16 9:02
 */
@Service
public class HouseManagerServiceImpl implements HouseManagerService {

    @Resource
    private HouseManagerMapper houseManagerMapper;

    @Override
    public Result queryList(HouseManagerIn paramIn) {
        HouseManagerOut houseManagerOut;
        List<HouseManagerOut> houseManagerOutList;
        PageInfo<House> pageInfo;
        HouseManagerListOut managerListOut;
        if (StringUtils.isEmpty(paramIn)) {
            return Result.error(CodeMsg.BIND_ISEMIPTY);
        }
        try {
            //分页
            Page<House> page = PageHelper.startPage(paramIn.getPageNum(),paramIn.getPageSize());
            List<House> houseList = houseManagerMapper.queryList(paramIn);
            pageInfo = new PageInfo<House>(houseList);
            houseManagerOutList = new ArrayList<>();
            managerListOut = new HouseManagerListOut();
            for (House item : pageInfo.getList()) {
                houseManagerOut = new HouseManagerOut();
                BeanUtils.copyProperties(item,houseManagerOut);
                //时间戳转换为日期格式
                houseManagerOut.setCreateTime(DateUtils.timeStamp2Date(item.getCreatetime().toString(), "yyyy-MM-dd HH:mm:ss"));
                houseManagerOutList.add(houseManagerOut);
            }
            BeanUtils.copyProperties(pageInfo,managerListOut);
            managerListOut.setManagerOuts(houseManagerOutList);
            return Result.success(managerListOut);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.error(CodeMsg.ERROR);
        }

    }

    @Override
    public Result saveOrUpdate(saveOrUpdateHouseIn paramIn) {

        return null;
    }


}
