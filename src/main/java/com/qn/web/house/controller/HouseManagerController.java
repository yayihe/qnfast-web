package com.qn.web.house.controller;

import com.qn.web.common.Result;
import com.qn.web.house.service.HouseManagerService;
import com.qn.web.house.vo.input.HouseManagerIn;
import com.qn.web.house.vo.input.saveOrUpdateHouseIn;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author LLL
 * @date 2019/12/16 9:00
 */
@Controller
@CrossOrigin(origins = "*")
@RequestMapping("/house/manager")
public class HouseManagerController {

    @Resource
    private HouseManagerService houseManagerService;

    /**
     * 房源列表
     * @param paramIn
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    @ResponseBody
    public Result houseList(@RequestBody HouseManagerIn paramIn){
        return houseManagerService.queryList(paramIn);
    }


    /**
     * 房源保存和修改
     * @param paramIn
     * @return
     */
    @RequestMapping(value = "/saveOrUpdate",method = RequestMethod.POST)
    @ResponseBody
    public Result saveOrUpdate(saveOrUpdateHouseIn paramIn){
        return null;
    }




}
