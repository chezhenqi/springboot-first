package com.learn.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.learn.springboot.entity.SysUser;
import com.learn.springboot.entity.SysUserExample;
import com.learn.springboot.entity.SysUserExample.Criteria;
import com.learn.springboot.mapper.SysUserMapper;

@Service
public class UserService {
	@Autowired
	private SysUserMapper userMapper;

	public List<SysUser> getList(String loginName) {
		SysUserExample example = new SysUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andLoginNameEqualTo(loginName);
		return userMapper.selectByExample(example);
	}

	public SysUser selectByPrimaryKey(String userId) {
		return userMapper.selectByPrimaryKey(userId);
	}

	public PageInfo<SysUser> getPage(JSONObject jsonObject) {
		Integer pageNum = jsonObject.getInteger("pageNum");
		Integer pageSize = jsonObject.getInteger("pageSize");
		PageHelper.startPage(pageNum == null ? 1 : pageNum, pageSize == null ? 10 : pageSize);
		List<SysUser> list = userMapper.selectByExample(null);
		PageInfo<SysUser> pageInfo = new PageInfo<>(list);
		return pageInfo;
	}

	public SysUser getByLoginName(String loginName) throws Exception {
		SysUserExample example = new SysUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andLoginNameEqualTo(loginName);
		List<SysUser> list = userMapper.selectByExample(example);
		return list.get(0);
	}
}
