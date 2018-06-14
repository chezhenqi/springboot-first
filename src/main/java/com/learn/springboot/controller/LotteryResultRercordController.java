package com.learn.springboot.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.learn.springboot.entity.LotteryResultRecord;
import com.learn.springboot.service.LotteryResultRecordService;
import com.learn.springboot.utils.CommonUtils;

@RestController
@RequestMapping("/lotteryResultRercord")
public class LotteryResultRercordController {
	@Autowired
	private LotteryResultRecordService lotteryResultRecordService;

	@RequestMapping("/page")
	public PageInfo<LotteryResultRecord> getPage(HttpServletRequest request, HttpServletResponse response) {
		return lotteryResultRecordService.getPage(CommonUtils.getJSONObject(request));
	}
}
