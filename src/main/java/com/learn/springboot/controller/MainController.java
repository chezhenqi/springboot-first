package com.learn.springboot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.learn.springboot.entity.Invest;
import com.learn.springboot.entity.Loan;
import com.learn.springboot.entity.LotteryNumber;
import com.learn.springboot.entity.LotteryResultRecord;
import com.learn.springboot.entity.SysUser;
import com.learn.springboot.service.InvestService;
import com.learn.springboot.service.LoanService;
import com.learn.springboot.service.LotteryNumberService;
import com.learn.springboot.service.LotteryResultRecordService;
import com.learn.springboot.service.UserService;
import com.learn.springboot.utils.CommonUtils;
import com.learn.springboot.utils.EncoderHandler;
import com.learn.springboot.utils.OperateResult;

@RestController
@RequestMapping("/main")
public class MainController {
	private Logger logger = Logger.getLogger(MainController.class);
	@Autowired
	private InvestService investService;
	@Autowired
	private LoanService loanService;
	@Autowired
	private LotteryNumberService lotteryNumberService;
	@Autowired
	private LotteryResultRecordService lotteryResultRecordService;
	@Autowired
	private UserService userService;
	@Autowired
	private EncoderHandler encoderHandler;
	private String weixinurl = "https:www.baidu.com";

	@RequestMapping("/getDragonMessages")
	public OperateResult getDragonMessages(HttpServletRequest request, HttpServletResponse response) {
		try {
			JSONObject jsonObject = CommonUtils.getJSONObject(request);
			String userId = jsonObject.getString("userId");
			Integer type = jsonObject.getInteger("type");
			SysUser user = userService.selectByPrimaryKey(userId);
			List<Invest> invests = investService.getListByUserIdSuccess(userId);
			List<Loan> loans = new ArrayList<>();
			for (Invest invest : invests) {
				Loan loan = loanService.getById(invest.getLoanId());
				loans.add(loan);
			}
			List<LotteryNumber> lotteryNumbers = lotteryNumberService.getListByTypeAndUserId(type, userId);
			List<LotteryResultRecord> lotteryResultRecords = lotteryResultRecordService
					.getListByUserIdAndLotteryId(userId, type);
			HashMap<String, Object> map = new HashMap<>();
			map.put("user", user);
			map.put("invests", invests);
			map.put("lotteryNumbers", lotteryNumbers);
			map.put("lotteryResultRecords", lotteryResultRecords);
			return new OperateResult(map);
		} catch (Exception e) {
			e.printStackTrace();
			return new OperateResult(e.getMessage());
		}
	}

	/**
	 * 获取端午节获得粽子的所有用户
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/checkDragon")
	public Map<String, Object> checkDragon(HttpServletRequest request, HttpServletResponse response) {
		try {
			Map<String, Object> result = new HashMap<>();
			List<Map<String, Object>> resultlist = new ArrayList<>();
			JSONObject jsonObject = CommonUtils.getJSONObject(request);
			List<LotteryNumber> lotteryNumbers = lotteryNumberService.getTypeList(jsonObject);
			if (lotteryNumbers != null && lotteryNumbers.size() > 0) {
				int count = 0;
				Map<String, Object> map = null;
				for (LotteryNumber lotteryNumber : lotteryNumbers) {
					if (lotteryNumber.getLotteryNumber3() > 0) {
						map = new HashMap<>();
						SysUser user = userService.selectByPrimaryKey(lotteryNumber.getUserId());
						logger.info("用户" + user.getLoginName() + "累计获得粽子数为:" + lotteryNumber.getLotteryNumber3());
						map.put("loginName", user.getLoginName());
						map.put("number1", lotteryNumber.getLotteryNumber1());
						map.put("number2", lotteryNumber.getLotteryNumber2());
						map.put("number3", lotteryNumber.getLotteryNumber3());
						resultlist.add(map);
						count += 1;
					}
				}
			}
			result.put("count", resultlist.size());
			result.put("resultList", resultlist);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 生成微信二维码
	 * 
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "centerPic")
	public void centerPic(HttpServletRequest request, HttpServletResponse response, Model model) {
		try {
			// 生成二维码
			JSONObject jsonObject = CommonUtils.getJSONObject(request);
			String loginName = jsonObject.getString("loginName");
			SysUser user = userService.getByLoginName(loginName);
			String content = "";
			if (user != null && user instanceof SysUser) {
				content = String.format(user.getLoginName());
			} else {
				content = weixinurl;
			}
			encoderHandler.encoderQRCoder(content, response);
		} catch (Exception e) {
			logger.error("未输入任何信息：" + e.getMessage(), e);
			encoderHandler.encoderQRCoder("未输入任何信息", response);
		}
	}
}
