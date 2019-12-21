package com.qn.web.login.service.impl;

import com.qn.web.common.CodeMsg;
import com.qn.web.common.Result;
import com.qn.web.entity.Role;
import com.qn.web.entity.User;
import com.qn.web.login.mapper.UserMapper;
import com.qn.web.login.service.LoginService;
import com.qn.web.login.vo.input.LoginIn;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private UserMapper userMapper;


    @Override
    public Result doLogin(LoginIn paramIn) {
        User user = new User();
        try {
            BeanUtils.copyProperties(paramIn,user);
            Integer res = userMapper.doLogin(user);
            if(StringUtils.isEmpty(res)){
                return  Result.error(CodeMsg.ERROR);
            }
            if(res == 1){
                return Result.success(res);
            }else{
                return Result.error(CodeMsg.PASSWORD_ERROR);
            }
        }catch (Exception e){
            e.printStackTrace();
            return  Result.error(CodeMsg.ERROR);
        }
    }


}
