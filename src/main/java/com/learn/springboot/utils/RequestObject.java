package com.learn.springboot.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSONObject;

public class RequestObject<T> {
	private static final Logger logger = Logger.getLogger(RequestObject.class);
	Class<T> c;

	public static <T> T getObject(HttpServletRequest request, Class<T> c) {
		T t = null;
		try {
			t = c.newInstance(); // 实例化参数对象
		} catch (InstantiationException e1) {
			logger.error(e1.getMessage(), e1);
		} catch (IllegalAccessException e1) {
			logger.error(e1.getMessage(), e1);
		}

		// 根据对象的set方法的参数类型去将请求的值做相应转换
		JSONObject jsonObject = CommonUtils.getJSONObject(request);
		Set<String> set = jsonObject.keySet();// 得到所有post参数
		Enumeration e = request.getParameterNames(); // 所有请求get参数
		Method[] methods = c.getDeclaredMethods(); // 参数对象的所有方法
		if (e.hasMoreElements()) {
			while (e.hasMoreElements()) {
				String paramName = e.nextElement().toString();
				String setParamName = reverseParamName(paramName); // 将参数名字转换成set方法名字，如：id 转换成 setId
				for (Method method : methods) {
					if (setParamName.equals(method.getName())) {
						try {
							Class<?> paramType = (method.getParameterTypes())[0]; // 得到set方法参数类型
							String value = request.getParameter(paramName);
							adapter(t, method, paramType, value); // 通过适配器将值注入进POJO里面
						} catch (IllegalArgumentException e1) {
							logger.error(e1.getMessage(), e1);
						} catch (IllegalAccessException e1) {
							logger.error(e1.getMessage(), e1);
						} catch (InvocationTargetException e1) {
							logger.error(e1.getMessage(), e1);
						} catch (SecurityException e1) {
							logger.error(e1.getMessage(), e1);
						}
					}
				}
			}
		}
		if (set.size() > 0) {
			for (String paramName : set) {
				System.out.println(paramName);
				String setParamName = reverseParamName(paramName); // 将参数名字转换成set方法名字，如：id 转换成 setId
				for (Method method : methods) {
					if (setParamName.equals(method.getName())) {
						try {
							Class<?> paramType = (method.getParameterTypes())[0]; // 得到set方法参数类型
							String value = jsonObject.getString(paramName);
							adapter(t, method, paramType, value); // 通过适配器将值注入进POJO里面
						} catch (IllegalArgumentException e1) {
							logger.error(e1.getMessage(), e1);
						} catch (IllegalAccessException e1) {
							logger.error(e1.getMessage(), e1);
						} catch (InvocationTargetException e1) {
							logger.error(e1.getMessage(), e1);
						} catch (SecurityException e1) {
							logger.error(e1.getMessage(), e1);
						}
					}
				}
			}
		}
		return t;
	}

	private static String reverseParamName(String paramName) {
		char firstChar = paramName.charAt(0);
		char toUpper = Character.toUpperCase(firstChar);
		String setParamName = "set" + String.valueOf(toUpper) + paramName.substring(1);
		return setParamName;
	}

	private static <T> void adapter(T t, Method method, Class<?> paramType, String value)
			throws IllegalAccessException, InvocationTargetException {
		if (paramType == String.class) {
			method.invoke(t, value);
		} else if (paramType == Integer.class || paramType == int.class) {
			method.invoke(t, Integer.parseInt(value));
		} else if (paramType == Long.class || paramType == long.class) {
			method.invoke(t, Long.parseLong(value));
		} else if (paramType == Boolean.class || paramType == boolean.class) {
			method.invoke(t, Boolean.parseBoolean(value));
		} else if (paramType == Short.class || paramType == short.class) {
			method.invoke(t, Short.parseShort(value));
		} else if (paramType == Float.class || paramType == float.class) {
			method.invoke(t, Float.parseFloat(value));
		} else if (paramType == Double.class || paramType == double.class) {
			method.invoke(t, Double.parseDouble(value));
		} else if (paramType == Character.class || paramType == char.class) {
			char[] cs = value.toCharArray();
			if (cs.length > 1) {
				throw new IllegalArgumentException("参数长度太大");
			}
			method.invoke(t, value.toCharArray()[0]);
		}
	}
}
