package com.swjtuhc.demo.controller;

import java.io.IOException;
import java.io.ObjectOutputStream.PutField;
import java.util.List;

import org.apache.ibatis.type.JdbcType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.swjtuhc.demo.model.Game;
import com.swjtuhc.demo.service.GameService;
import com.swjtuhc.demo.service.GamesService;

import net.sf.json.JSONObject;



@RestController
@RequestMapping("/games")
public class GameController {

	@Autowired
	GameService gameService;
	@RequestMapping("/getGame")
	public List<Game> getGame(){
		
		return gameService.getGameList();
	}
	
	//创建游戏的
		@RequestMapping("/createGame")
		public JSONObject createGame(Game game,MultipartFile file  ) {
			JSONObject result = new JSONObject();
			game.setPoster(file.getOriginalFilename());
			int i=0;
			try {
			i=	gameService.createGame(game, file.getInputStream());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			result.put("state",i);
			return result;
		}
	//对数据库进行查找操作
	 @RequestMapping("/getGameByname")
	    @ResponseBody
	    public List<Game> findGameByName(String gameName){
	        return gamesservice.findByName(gameName);
	    }
	 @Autowired
	    private GamesService gamesservice;
	    //对数据库进行的删除操作
	 @ResponseBody
	    @RequestMapping(value = "/delete", method = RequestMethod.GET)
	    public String delete(int g_id) {
	        int d = gamesservice.delete(g_id);
	        if (d > 1) {
	            return "删除成功";
	        } else {
	            return "删除失败";
	        }
	    }
	    //对数据进行修改的操作
	    @RequestMapping(value = "/update", method = RequestMethod.POST)
	    public String update(Game gamename) {
	        int c = gamesservice.Update(gamename);
	        if (c >1) {
	            return "修改成功";
	        } else {
	            return "修改失败";
	        }
	    }
	    //对数据库进行增加字段操作
	    @RequestMapping(value = "/insert", method = RequestMethod.POST)
	    public Game insert(Game gamename)
	    {
	        return gamesservice.insertGame(gamename);
	        }
	    
	
	
}
