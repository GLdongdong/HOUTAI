package com.swjtuhc.demo.service;

import java.io.InputStream;
import java.util.List;

import com.swjtuhc.demo.model.Game;

public interface GameService {
    public List<Game> getGameList();
    public int createGame(Game game,InputStream fileStream);
   
   
}
