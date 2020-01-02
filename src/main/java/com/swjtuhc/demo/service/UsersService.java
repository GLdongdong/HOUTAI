//package com.swjtuhc.demo.service;
//
//import org.springframework.stereotype.Service;
//
//import com.swjtuhc.demo.mapper.GameMapper;
//import com.swjtuhc.demo.mapper.UserMapper;
//import com.swjtuhc.demo.model.Game;
//
//import java.util.List;
//
//import org.apache.catalina.User;
//import org.springframework.beans.factory.annotation.Autowired;
//
//@Service
//public class UsersService {
//
//	  @Autowired
//	    private UserMapper userMapper;
//	    public List<User> findByName(String username) {
//	        return userMapper.findUserByName(username);
//	    }
//	    public User insertuser(User user) { userMapper.insertUser(user);return user;}
//	    public List<User> ListUser(){
//	        return  userMapper.ListUser();
//	    }
//	    public int Update(User user){
//	        return userMapper.Update(user);
//	    }   
//	    public int delete(int u_id){
//	        return userMapper.delete(u_id);
//	    }
//		
//	
//}
