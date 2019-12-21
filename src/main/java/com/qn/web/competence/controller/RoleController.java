package com.qn.web.competence.controller;

import com.qn.web.competence.service.RoleService;
import com.qn.web.entity.Role;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/role")
public class RoleController {

    @Resource
    private RoleService roleService;

    @RequestMapping(value = "/index")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/show")
    @ResponseBody
    public Object show(){
        return roleService.roleList();
    }



}
