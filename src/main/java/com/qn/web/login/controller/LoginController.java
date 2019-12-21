package com.qn.web.login.controller;

import com.qn.web.common.Result;
import com.qn.web.login.service.LoginService;
import com.qn.web.login.vo.input.LoginIn;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class LoginController {

    @Resource
    private LoginService loginService;


    /**
     * 用户登录
     * @param paramIn
     * @return
     */
    @RequestMapping(value = "/login")
    @ResponseBody
    public Result doLogin(@RequestBody LoginIn paramIn){
        return loginService.doLogin(paramIn);
    }



}
