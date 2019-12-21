package com.qn.web.login.mapper;

import com.qn.web.common.CurdMapper;
import com.qn.web.entity.Role;
import com.qn.web.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper extends CurdMapper<User> {

    Integer doLogin(@Param("user") User user);


}
