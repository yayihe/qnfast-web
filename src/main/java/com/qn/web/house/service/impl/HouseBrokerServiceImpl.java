package com.qn.web.house.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qn.web.common.CodeMsg;
import com.qn.web.common.Result;
import com.qn.web.entity.Broker;
import com.qn.web.house.mapper.HouseBrokerMapper;
import com.qn.web.house.service.HouseBrokerService;
import com.qn.web.house.vo.input.HouseBrokerIn;
import com.qn.web.house.vo.output.HouseBrokerListOut;
import com.qn.web.house.vo.output.HouseBrokerOut;
import com.sun.org.apache.bcel.internal.classfile.Code;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 房产经纪人业务类
 *
 * @author LLL
 * @date 2019/12/17 11:34
 */
@Service
public class HouseBrokerServiceImpl implements HouseBrokerService {


    @Resource
    private HouseBrokerMapper houseBrokerMapper;


    @Override
    public Result queryList(HouseBrokerIn paramIn) {
        List<Broker> brokerList;
        HouseBrokerOut houseBrokerOut;
        List<HouseBrokerOut> houseBrokerOutList;
        if (StringUtils.isEmpty(paramIn)) {
            return Result.error(CodeMsg.BIND_ISEMIPTY);
        }
        try {
            //分页
            Page<Broker> page = PageHelper.startPage(paramIn.getPageNum(),paramIn.getPageSize());
            brokerList = houseBrokerMapper.queryList(paramIn.getMobileOrName());
            PageInfo<Broker> pageInfo = new PageInfo<Broker>(page);
            houseBrokerOutList = new ArrayList<>();
            for (Broker item:brokerList) {
                houseBrokerOut = new HouseBrokerOut();
                BeanUtils.copyProperties(item,houseBrokerOut);
                houseBrokerOutList.add(houseBrokerOut);
            }
            HouseBrokerListOut brokerListOut = new HouseBrokerListOut();
            //组装分页参数
            BeanUtils.copyProperties(pageInfo,brokerListOut);
            brokerListOut.setBrokerOuts(houseBrokerOutList);
            return Result.success(brokerListOut);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.error(CodeMsg.ERROR);
        }
    }

    @Override
    public Result saveOrUpdate(HouseBrokerIn paramIn) {
        Broker broker;
        if (StringUtils.isEmpty(paramIn)){
            return Result.error(CodeMsg.BIND_ERROR);
        }
        try {
            broker = new Broker();
            if (paramIn.getIsSave().equals("0")){
                houseBrokerMapper.save(broker);
                return Result.success("添加成功");
            }else{
                houseBrokerMapper.update(broker);
                return Result.success("修改成功");
            }
        }catch (Exception e){
            e.printStackTrace();
            return Result.error(CodeMsg.BIND_ERROR);
        }
    }

    @Override
    public Result delete(HouseBrokerIn paramIn) {
        if (StringUtils.isEmpty(paramIn)){
            return Result.error(CodeMsg.BIND_ERROR);
        }
        try {
            int str = houseBrokerMapper.batchdelete(paramIn.getIds());
            if (str>0){
                return Result.success(str);
            }else{
                return Result.error(CodeMsg.BIND_ERROR);
            }
        }catch (Exception e){
            e.printStackTrace();
            return Result.error(CodeMsg.ERROR);
        }
    }
}
