package com.swjtuhc.demo.controller;

import java.io.IOException;
import java.io.ObjectOutputStream.PutField;
import java.util.List;

import org.apache.ibatis.type.JdbcType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.swjtuhc.demo.model.Game;
import com.swjtuhc.demo.service.GameService;

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
}
