package com.learn.springboot.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.learn.springboot.entity.LotteryResultRecord;
import com.learn.springboot.entity.LotteryResultRecordExample;

public interface LotteryResultRecordMapper {
	int countByExample(LotteryResultRecordExample example);

	int deleteByExample(LotteryResultRecordExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(LotteryResultRecord record);

	int insertSelective(LotteryResultRecord record);

	List<LotteryResultRecord> selectByExample(LotteryResultRecordExample example);

	LotteryResultRecord selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") LotteryResultRecord record,
			@Param("example") LotteryResultRecordExample example);

	int updateByExample(@Param("record") LotteryResultRecord record,
			@Param("example") LotteryResultRecordExample example);

	int updateByPrimaryKeySelective(LotteryResultRecord record);

	int updateByPrimaryKey(LotteryResultRecord record);

	List<LotteryResultRecord> getListByUserIdAndLotteryId(Map<String, Object> map) throws Exception;
}