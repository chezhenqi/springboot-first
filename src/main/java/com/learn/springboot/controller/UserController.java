package com.learn.springboot.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.learn.springboot.entity.SysUser;
import com.learn.springboot.service.UserService;
import com.learn.springboot.utils.CommonUtils;
import com.learn.springboot.utils.RequestObject;

@RestController
@RequestMapping("/user")
public class UserController {
	private static final Logger logger = Logger.getLogger(UserController.class);
	@Autowired
	private UserService userService;

	@RequestMapping("/getList")
	public List<SysUser> getList(HttpServletRequest request, HttpServletResponse response) {
		JSONObject jsonObject = CommonUtils.getJSONObject(request);
		// SysUser user = jsonObject.getObject("user", SysUser.class);此方法可以得到json格式传入的对象
		String loginName = jsonObject.getString("loginName");
		return userService.getList(loginName);
	}

	@RequestMapping("/getObject")
	public SysUser getObj(HttpServletRequest request, HttpServletResponse response) {
		SysUser user = RequestObject.getObject(request, SysUser.class);
		return user;
	}

	@RequestMapping("/page")
	public PageInfo<SysUser> getPage(HttpServletRequest request, HttpServletResponse response) {
		return userService.getPage(CommonUtils.getJSONObject(request));
	}
}
