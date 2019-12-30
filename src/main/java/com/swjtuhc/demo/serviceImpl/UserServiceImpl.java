package com.swjtuhc.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swjtuhc.demo.mapper.UserMapper;
import com.swjtuhc.demo.model.SysUser;
import com.swjtuhc.demo.service.UserService;

import ch.qos.logback.core.joran.conditional.IfAction;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserMapper userMapper;
	
	@Override
	public int register(SysUser user) {
		// TODO Auto-generated method stub
		  
		// 调用mapper实现注册
		SysUser u0=userMapper.selectUserByUsername(user.getUsername());
		
		int i = 1;
		if (u0==null) {
			i=userMapper.insertUser(user);   
		}else {
			i=2;
		}
		return i;
	}

	@Override
	public int login(SysUser user) {
		// TODO Auto-generated method stub
		
		//调用mapper登录
SysUser u1=userMapper.selectUserByPassword(user.getUsername(),user.getPassword());
		int i = 1;
		if (u1!=null) {
			i=userMapper.insertUser(user);   
		}else {
			i=2;
		}
		return i;
	}

}
