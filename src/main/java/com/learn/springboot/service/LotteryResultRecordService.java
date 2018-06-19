package com.learn.springboot.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.learn.springboot.entity.LotteryResultRecord;
import com.learn.springboot.mapper.LotteryResultRecordMapper;

@Service
public class LotteryResultRecordService {
	@Autowired
	private LotteryResultRecordMapper lotteryResultRecordMapper;

	public PageInfo<LotteryResultRecord> getPage(JSONObject jsonObject) {
		Integer pageNum = jsonObject.getInteger("pageNum"); 
		Integer pageSize = jsonObject.getInteger("pageSize");
		PageHelper.startPage(pageNum == null ? 1 : pageNum, pageSize == null ? 10 : pageSize);
		List<LotteryResultRecord> list = lotteryResultRecordMapper.selectByExample(null);
		PageInfo<LotteryResultRecord> pageInfo = new PageInfo<>(list);
		return pageInfo;
	}

	public List<LotteryResultRecord> getListByUserIdAndLotteryId(String userId, Integer type) throws Exception {
		Map<String, Object> map = new HashMap<>();
		map.put("userId", userId);
		map.put("lotteryId", type);
		return lotteryResultRecordMapper.getListByUserIdAndLotteryId(map);
	}

	public LotteryResultRecord getById(Integer id) {
		return lotteryResultRecordMapper.selectByPrimaryKey(id);
	}
}
