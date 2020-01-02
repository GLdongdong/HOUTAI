package com.swjtuhc.demo.controller;





import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.swjtuhc.demo.model.Game;
import com.swjtuhc.demo.model.SysUser;
import com.swjtuhc.demo.service.GamesService;
import com.swjtuhc.demo.service.UserService;


import net.sf.json.JSONObject;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    
  

    
	@RequestMapping("/register")
	public JSONObject register(@RequestBody SysUser user) {
		JSONObject result = new JSONObject();
		
		
		//调用Service层
		int i =userService.register(user);
		result.put("state", i);
		
		return result;
	}
	@RequestMapping("/login")
	public JSONObject login(@RequestBody SysUser user) {
		JSONObject result = new JSONObject();
		
		
		//调用Service层
		int i =userService.login(user);
		result.put("state", i);
		
		return result;
	}



////对用户账号进行查找操作
//	 @RequestMapping("/getUserByname")
//	    @ResponseBody
//	    public List<User> findUserByName(String username){
//	        return usersservice.findByName(username);
//	    }
//	 @Autowired
//	    private UsersService usersservice;
//	    //对用户进行的删除操作
//	 @ResponseBody
//	    @RequestMapping(value = "/delete", method = RequestMethod.GET)
//	    public String delete(int g_id) {
//	        int d = usersservice.delete(g_id);
//	        if (d > 1) {
//	            return "删除成功";
//	        } else {
//	            return "删除失败";
//	        }
//	    }
//	    //对用户进行修改的操作
//	    @RequestMapping(value = "/update", method = RequestMethod.POST)
//	    public String update(User username) {
//	        int c = usersservice.Update(username);
//	        if (c >1) {
//	            return "修改成功";
//	        } else {
//	            return "修改失败";
//	        }
//	    }
//	    //对对用户进行增加字段操作
//	    @RequestMapping(value = "/insert", method = RequestMethod.POST)
//	    public User insert(User username)
//	    {
//	        return usersservice.insertuser(username);
//	        }
//	
	
}
