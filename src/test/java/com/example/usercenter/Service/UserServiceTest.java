package com.example.usercenter.Service;

import com.example.usercenter.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

//用户服务测试
@SpringBootTest
class UserServiceTest {
    @Resource
    private UserService userService;

    @Test
    public void testAddUser() {

        User user = new User();
        user.setUsername("test1");
        user.setUserAccount("yupi");
        user.setAvatarUrl("https://images.zsxq.com/FiPBFfWlwK0F_LGC_khEhIsSBLsO?e=1654012799&token=kIxbL07-8jAj8w1n4s9zv64FuZZNEATmlU_Vm6zD:8kBIk55hfQwHeCwwERxqI1orAyk=");
        user.setGender(0);
        user.setUserPassword("xxxxxxxx");
        user.setPhone("123456789");
        user.setEmail("1");
        user.setUserCode("1");
        boolean result = userService.save(user);
        System.out.println(user.getId());
        Assertions.assertTrue(result);
    }

    @Test
    void userRegister() {
//        String userAccount = "yupi";
//        String userPassword = "";
//        String checkPassword = "123456";
//        String Code = "01";
//        long result = userService.userRegister(userAccount, userPassword, checkPassword, Code);
//        Assertions.assertEquals(-1, result);
//
//        userAccount = "yu";
//        result = userService.userRegister(userAccount, userPassword, checkPassword,Code);
//        Assertions.assertEquals(-1, result);
//
//        userAccount = "yupi";
//        userPassword = "123456";
//        result = userService.userRegister(userAccount, userPassword, checkPassword,Code);
//        Assertions.assertEquals(-1, result);
//
//        userAccount = "yu pi";
//        userPassword = "12345678";
//        result = userService.userRegister(userAccount, userPassword, checkPassword,Code);
//        Assertions.assertEquals(-1, result);
//
//        checkPassword = "123456789";
//        result = userService.userRegister(userAccount, userPassword, checkPassword,Code);
//        Assertions.assertEquals(-1, result);
//
//        userAccount = "dogyupi";
//        userPassword = "12345678";
//        result = userService.userRegister(userAccount, userPassword, checkPassword,Code);
//        Assertions.assertEquals(-1, result);

        String userAccount = "yupi117";
        String userPassword = "0123456789";
        String checkPassword = "0123456789";
        String userCode = "0005";
        long result = userService.userRegister(userAccount, userPassword, checkPassword,userCode);
        Assertions.assertTrue(result>0);
    }
}