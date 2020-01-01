package com.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.swjtuhc.demo.model.Strategy;


@Mapper
public interface StrategyMapper {

	public List<Strategy> selectStrategy();
}
