package com.learn.springboot.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.learn.springboot.entity.Invest;
import com.learn.springboot.entity.InvestExample;

public interface InvestMapper {
	int countByExample(InvestExample example);

	int deleteByExample(InvestExample example);

	int deleteByPrimaryKey(String id);

	int insert(Invest record);

	int insertSelective(Invest record);

	List<Invest> selectByExample(InvestExample example);

	Invest selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") Invest record, @Param("example") InvestExample example);

	int updateByExample(@Param("record") Invest record, @Param("example") InvestExample example);

	int updateByPrimaryKeySelective(Invest record);

	int updateByPrimaryKey(Invest record);

	List<Invest> getListByUserIdSuccess(Map<String, Object> map) throws Exception;
}