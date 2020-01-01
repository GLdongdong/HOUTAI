package com.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.swjtuhc.demo.model.Game;

@Mapper
public interface GameMapper {
   public List<Game> selectAllGames();
   List<Game> findGameByName(String gameName);
   public List<Game> ListGame();
   
   public int delete(int g_id);
   public int Update(Game game);

   public int insertGame(Game game);
}

