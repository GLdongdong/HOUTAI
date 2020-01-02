package com.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;


import com.swjtuhc.demo.model.SysUser;

@Mapper

public interface UserMapper {
	public SysUser selectUserByUsername(String username);
	public SysUser selectUserByPass(String username,String password);
    public int insertUser(SysUser user);
//    public List<User> selectAllUsers();
//    List<User> findUserByName(String username);
//    public List<User> ListUser();
//    
//    public int delete(int gu_id);
//    public int Update(User user);
//
//    public int insertUser(User user);
}
