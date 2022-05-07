package com.example.usercenter.Service;

import com.example.usercenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
* @author pc
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2022-03-30 23:32:21
*/
public interface UserService extends IService<User> {

    //按一下/**再按回车自动生成javadoc注释
    /**
     * 用户注释
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @param userCode 用户编号
     * @return
     */
    long userRegister(String userAccount, String userPassword, String checkPassword, String userCode);

    /**
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param request
     * @return
     */
    User userlogin(String userAccount, String userPassword, HttpServletRequest request);

    User getSafetyUser(User originUser);

    /**
     *用户注销
     * @param request
     * @return
     */
  int userLogout(HttpServletRequest request);
}
