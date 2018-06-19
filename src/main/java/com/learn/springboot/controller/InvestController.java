package com.learn.springboot.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.learn.springboot.entity.Invest;
import com.learn.springboot.service.InvestService;
import com.learn.springboot.utils.CommonUtils;

@RestController
@RequestMapping("/invest")
public class InvestController {
	private static final Logger logger = Logger.getLogger(InvestController.class);
	@Autowired
	private InvestService investService;

	@RequestMapping("/page")
	public PageInfo<Invest> getPage(HttpServletRequest request, HttpServletResponse response) {
		return investService.getPage(CommonUtils.getJSONObject(request));
	}
}
