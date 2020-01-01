package com.swjtuhc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swjtuhc.demo.model.Summary;
import com.swjtuhc.demo.service.SummaryService;

@RestController
@RequestMapping("/games")
public class SummaryController {
    
	
	@Autowired
	SummaryService SummaryService;
	
	@RequestMapping("/getSummary")
	public List<Summary> getSummary(){
		return SummaryService.getSummary();
	}
}