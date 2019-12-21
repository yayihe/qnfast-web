package com.qn.web.login.vo.input;


import com.qn.web.common.BaseParam;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 *
 * @author LLL
 */
@Data
public class LoginIn extends BaseParam {

    @NotBlank(message = "用户名不能为空")
    private String userName;

    @NotBlank(message = "密码不能为空")
    private String passWord;


}
