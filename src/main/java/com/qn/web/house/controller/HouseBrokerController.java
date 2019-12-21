package com.qn.web.house.controller;

import com.qn.web.common.Result;
import com.qn.web.house.service.HouseBrokerService;
import com.qn.web.house.vo.input.HouseBrokerIn;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 房产经纪人管理
 *
 * @author LLL
 * @date 2019/12/17 11:32
 */
@Controller
@CrossOrigin("*")
@RequestMapping("/house/broker")
public class HouseBrokerController {

    @Resource
    private HouseBrokerService houseBrokerService;

    /**
     * 经纪人列表
     * @param paramIn
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    @ResponseBody
    public Result queryList(@RequestBody HouseBrokerIn paramIn){
        return houseBrokerService.queryList(paramIn);
    }

    /**
     * 经纪人删除
     * @param paramIn
     * @return
     */
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ResponseBody
    public Result delete(@RequestBody HouseBrokerIn paramIn){
        return houseBrokerService.delete(paramIn);
    }

    /**
     * 经纪人添加或修改
     * @param paramIn
     * @return
     */
    @RequestMapping(value = "/saveOrUpdate",method = RequestMethod.POST)
    @ResponseBody
    public Result saveOrUpdate(@RequestBody HouseBrokerIn paramIn){
        return houseBrokerService.saveOrUpdate(paramIn);
    }


}
