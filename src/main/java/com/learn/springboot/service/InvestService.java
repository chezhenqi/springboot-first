package com.learn.springboot.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.learn.springboot.entity.Invest;
import com.learn.springboot.mapper.InvestMapper;

@Service
public class InvestService {
	@Autowired
	private InvestMapper investMapper;

	public PageInfo<Invest> getPage(JSONObject jsonObject) {
		Integer pageNum = jsonObject.getInteger("pageNum");
		Integer pageSize = jsonObject.getInteger("pageSize");
		PageHelper.startPage(pageNum == null ? 1 : pageNum, pageSize == null ? 10 : pageSize);
		List<Invest> list = investMapper.selectByExample(null);
		PageInfo<Invest> pageInfo = new PageInfo<>(list);
		return pageInfo;
	}

	public List<Invest> getListByUserIdSuccess(String userId) throws Exception {
		Map<String, Object> map = new HashMap<>();
		map.put("userId", userId);
		return investMapper.getListByUserIdSuccess(map);
	}
	
	public Invest getById(String id) {
		return investMapper.selectByPrimaryKey(id);
	}
}
