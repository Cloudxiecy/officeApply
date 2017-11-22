package com.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pojo.UserInfo;
import com.service.UserService;
import com.util.Message;


@Controller  
public class UserController {

	
	@Autowired  
    private UserService userService;  
      
	
//	@RequestMapping(value = "/view", method = RequestMethod.GET)
//    public String showUserInfo(@RequestParam("courseId") Integer courseId ,Model model){  
//        UserInfo userInfo = userService.getUserById("u1101");  
//        Map<String, Object> map =new  HashMap<String, Object>();
//        map.put("flag","true");
//        return "";  
//    }
	
	@RequestMapping(value = "/view2/{courseId}", method = RequestMethod.GET)
	public String showUserInfo2(@PathVariable("courseId")Integer courseId ,Map<String, Object> model){  
	  UserInfo userInfo = userService.getUserById("u1101");  
	  Map<String, Object> map =new  HashMap<String, Object>();
	  map.put("flag","true");
	  return "";  
	}
	
	@RequestMapping(value = "/view3", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Map<String, Object> showUserInfo3(@RequestParam Map<String, Object> model){  
	  UserInfo userInfo = userService.getUserById("u1101");  
	  Map<String, Object> map =new  HashMap<String, Object>();
	  map.put("flag","true");
	  return map;  
	}

}
