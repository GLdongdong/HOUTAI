package com.swjtuhc.demo.service;

import org.springframework.stereotype.Service;

import com.swjtuhc.demo.mapper.GameMapper;
import com.swjtuhc.demo.model.Game;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class GamesService {

	  @Autowired
	    private GameMapper gameMapper;
	    public List<Game> findByName(String gamename) {
	        return gameMapper.findGameByName(gamename);
	    }
	    public Game insertGame(Game game) { gameMapper.insertGame(game);return game;}
	    public List<Game> ListGame(){
	        return  gameMapper.ListGame();
	    }
	    public int Update(Game game){
	        return gameMapper.Update(game);
	    }   
	    public int delete(int g_id){
	        return gameMapper.delete(g_id);
	    }
	
}
