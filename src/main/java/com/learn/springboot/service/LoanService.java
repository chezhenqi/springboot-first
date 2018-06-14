package com.learn.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.learn.springboot.entity.Loan;
import com.learn.springboot.mapper.LoanMapper;

@Service
public class LoanService {
	@Autowired
	private LoanMapper loanMapper;

	public PageInfo<Loan> getPage(JSONObject jsonObject) {
		Integer pageNum = jsonObject.getInteger("pageNum");
		Integer pageSize = jsonObject.getInteger("pageSize");
		PageHelper.startPage(pageNum == null ? 1 : pageNum, pageSize == null ? 10 : pageSize);
		List<Loan> list = loanMapper.selectByExample(null);
		PageInfo<Loan> pageInfo = new PageInfo<>(list);
		return pageInfo;
	}

	public Loan getById(String loanId) {
		return loanMapper.selectByPrimaryKey(loanId);
	}
}
