package com.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.swjtuhc.demo.model.Game;

@Mapper
public interface GameMapper {
   public List<Game> selectAllGames();
}
