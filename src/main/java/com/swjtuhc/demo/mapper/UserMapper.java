package com.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.swjtuhc.demo.model.SysUser;

@Mapper

public interface UserMapper {
	public SysUser selectUserByUsername(String username);
	public SysUser selectUserByPassword(String username,String password);
    public int insertUser(SysUser user);
}
