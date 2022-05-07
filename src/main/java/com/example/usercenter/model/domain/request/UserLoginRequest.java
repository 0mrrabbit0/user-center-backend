package com.example.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author:zlj
 * @Date:2022/4/3 13:47
 **/
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 3479133601033257817L;

    private String userAccount;

    private String userPassword;
}
