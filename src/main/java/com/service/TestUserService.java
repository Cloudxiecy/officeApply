package com.service;

import java.util.List;  

import com.pojo.UserInfo;  
import org.apache.log4j.Logger;  
import org.junit.Test;  
import org.junit.runner.RunWith;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.test.context.ContextConfiguration;  
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;  
  
import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = { "classpath:config/spring-mvc.xml",  
        "classpath:config/spring-mybatis.xml" })  
public class TestUserService {  
  
    private static final Logger LOGGER = Logger  
            .getLogger(TestUserService.class);  
  
    @Autowired  
    private UserService userService;  
  
      
    @Test  
    public void testQueryById1() {  
        UserInfo userInfo = userService.getUserById("u1101");  
        LOGGER.info(JSON.toJSON(userInfo));  
    }  
  
    @Test  
    public void testQueryAll() {  
//        List<UserInfo> userInfos = userService.getUsers();  
//        LOGGER.info(JSON.toJSON(userInfos));  
    }  
  
    @Test  
    public void testInsert() {  
        UserInfo userInfo = new UserInfo();  
        userInfo.setUserid("u1103");  
        userInfo.setFullname("王五");  
        int result = userService.insert(userInfo);  
        System.out.println(result);  
    }  
}  