package com.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.swjtuhc.demo.model.Summary;
import com.swjtuhc.demo.model.Summary;

@Mapper
public interface SummaryMapper {

	public List<Summary> selectSummary();
}
