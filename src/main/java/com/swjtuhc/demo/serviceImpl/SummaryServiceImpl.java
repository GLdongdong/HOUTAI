package com.swjtuhc.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swjtuhc.demo.mapper.SummaryMapper;
import com.swjtuhc.demo.mapper.SummaryMapper;
import com.swjtuhc.demo.model.Summary;
import com.swjtuhc.demo.service.SummaryService;

@Service
public class SummaryServiceImpl implements SummaryService{

	@Autowired
	SummaryMapper summaryMapper;
	@Override
	public List<Summary> getSummary() {
		// TODO Auto-generated method stub
		return summaryMapper.selectSummary();
	}
	

}
