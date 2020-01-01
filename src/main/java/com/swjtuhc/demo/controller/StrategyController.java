package com.swjtuhc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swjtuhc.demo.model.Strategy;
import com.swjtuhc.demo.service.StrategyService;

@RestController
@RequestMapping("/games")
public class StrategyController {
    
	
	@Autowired
	StrategyService StrategyService;
	
	@RequestMapping("/getStrategy")
	public List<Strategy> getStrategy(){
		return StrategyService.getStrategy();
	}
}