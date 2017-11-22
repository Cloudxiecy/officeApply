package com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserInfoMapper;
import com.pojo.UserInfo;
import com.service.UserService;

@Service("userService")  
public class UserServiceImpl implements UserService {  
  
    @Autowired  
    private UserInfoMapper userInfoMapper;  
  
    @Override  
    public UserInfo getUserById(String id) {  
        return userInfoMapper.selectByPrimaryKey(id);  
    }  
  
//    @Override  
//    public List<UserInfo> getUsers() {  
//        return userInfoMapper.selectAll();  
//    }  
  
    @Override  
    public int insert(UserInfo userInfo) {  
          
        int result = userInfoMapper.insert(userInfo);  
          
        System.out.println(result);  
        return result;  
    }  
  
}  
