package com.learn.springboot.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.learn.springboot.entity.LotteryNumber;
import com.learn.springboot.entity.LotteryNumberExample;

public interface LotteryNumberMapper {
	int countByExample(LotteryNumberExample example);

	int deleteByExample(LotteryNumberExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(LotteryNumber record);

	int insertSelective(LotteryNumber record);

	List<LotteryNumber> selectByExample(LotteryNumberExample example);

	LotteryNumber selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") LotteryNumber record, @Param("example") LotteryNumberExample example);

	int updateByExample(@Param("record") LotteryNumber record, @Param("example") LotteryNumberExample example);

	int updateByPrimaryKeySelective(LotteryNumber record);

	int updateByPrimaryKey(LotteryNumber record);

	List<LotteryNumber> getTypeList(Map<String, Object> map) throws Exception;

	List<LotteryNumber> getListByTypeAndUserId(Map<String, Object> map) throws Exception;
}