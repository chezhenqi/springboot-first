package com.learn.springboot.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.learn.springboot.entity.LotteryNumber;
import com.learn.springboot.service.LotteryNumberService;
import com.learn.springboot.utils.CommonUtils;

@RestController
@RequestMapping("/lotteryNumber")
public class LotteryNumberController {
	private static final Logger logger = Logger.getLogger(LotteryNumberController.class);
	@Autowired
	private LotteryNumberService lotteryNumberService;

	@RequestMapping("/page")
	public PageInfo<LotteryNumber> getPage(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return lotteryNumberService.getPage(CommonUtils.getJSONObject(request));
	}
}
