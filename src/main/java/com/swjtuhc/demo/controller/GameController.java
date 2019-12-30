package com.swjtuhc.demo.controller;

import java.util.List;

import org.apache.ibatis.type.JdbcType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swjtuhc.demo.model.Game;
import com.swjtuhc.demo.service.GameService;



@RestController
@RequestMapping("/games")
public class GameController {

	@Autowired
	GameService gameService;
	@RequestMapping("/getGame")
	public List<Game> getGame(){
		
		return gameService.getGameList();
	}
}
