package com.service;

import java.util.List;

import com.pojo.UserInfo;

public interface UserService {  
	  
    UserInfo getUserById(String id);  
      
    //List<UserInfo> getUsers();  
      
    int insert(UserInfo userInfo);  
}
