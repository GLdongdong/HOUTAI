package com.swjtuhc.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swjtuhc.demo.mapper.StrategyMapper;
import com.swjtuhc.demo.model.Strategy;
import com.swjtuhc.demo.service.StrategyService;

@Service
public class StrategyServiceImpl implements StrategyService{

	@Autowired
	StrategyMapper strategyMapper;
	@Override
	public List<Strategy> getStrategy() {
		// TODO Auto-generated method stub
		return strategyMapper.selectStrategy();
	}
	

}
