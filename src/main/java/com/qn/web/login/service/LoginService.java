package com.qn.web.login.service;

import com.qn.web.common.Result;
import com.qn.web.entity.Role;
import com.qn.web.login.vo.input.LoginIn;

import java.util.List;

public interface LoginService {

    Result doLogin(LoginIn paramIn);


}
