package com.swjtuhc.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swjtuhc.demo.mapper.GameMapper;
import com.swjtuhc.demo.model.Game;
import com.swjtuhc.demo.service.GameService;

@Service
public class GameServiceImpl implements GameService{

	
	@Autowired
	GameMapper GameMapper;
	@Override
	public List<Game> getGameList() {
		// TODO Auto-generated method stub
		return GameMapper.selectAllGames();
	}

}
