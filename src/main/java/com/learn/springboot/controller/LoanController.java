package com.learn.springboot.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.learn.springboot.entity.Loan;
import com.learn.springboot.service.LoanService;
import com.learn.springboot.utils.CommonUtils;

@RestController
@RequestMapping("/loan")
public class LoanController {
	@Autowired
	private LoanService loanService;

	@RequestMapping("/page")
	public PageInfo<Loan> getPage(HttpServletRequest request, HttpServletResponse response) {
		return loanService.getPage(CommonUtils.getJSONObject(request));
	}
}
