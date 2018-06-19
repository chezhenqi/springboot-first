package com.learn.springboot.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.learn.springboot.entity.LotteryNumber;
import com.learn.springboot.mapper.LotteryNumberMapper;

@Service
public class LotteryNumberService {
	@Autowired
	private LotteryNumberMapper lotteryNumberMapper;

	public List<LotteryNumber> getTypeList(JSONObject jsonObject) throws Exception {
		Map<String, Object> map = jsonObject;
		return lotteryNumberMapper.getTypeList(map);
	}

	public PageInfo<LotteryNumber> getPage(JSONObject jsonObject) throws Exception {
		Integer pageNum = jsonObject.getInteger("pageNum"); 
		Integer pageSize = jsonObject.getInteger("pageSize");
		PageHelper.startPage(pageNum == null ? 1 : pageNum, pageSize == null ? 10 : pageSize);
		List<LotteryNumber> list = lotteryNumberMapper.selectByExample(null);
		PageInfo<LotteryNumber> pageInfo = new PageInfo<>(list);
		return pageInfo;
	}

	public List<LotteryNumber> getListByTypeAndUserId(Integer type, String userId) throws Exception {
		Map<String, Object> map = new HashMap<>();
		map.put("userId", userId);
		map.put("type", type);
		return lotteryNumberMapper.getListByTypeAndUserId(map);
	}

	public LotteryNumber getById(Integer id) {
		return lotteryNumberMapper.selectByPrimaryKey(id);
	}
}
