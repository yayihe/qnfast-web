package com.qn.web.competence.service.impl;

import com.qn.web.competence.mapper.RoleMapper;
import com.qn.web.competence.service.RoleService;
import com.qn.web.entity.Role;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Resource
    private RoleMapper mapper;


    @Override
    public List<Role> roleList() {
        return mapper.selectAll();
    }
}
