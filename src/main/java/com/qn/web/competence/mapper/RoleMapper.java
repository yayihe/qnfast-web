package com.qn.web.competence.mapper;

import com.qn.web.common.CurdMapper;
import com.qn.web.entity.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleMapper extends CurdMapper<Role> {
    List<Role> roleList();
}
