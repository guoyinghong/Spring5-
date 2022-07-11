package com.shadow.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: guoyinghong
 * @date: 2022/7/7 下午12:28
 * @Description:
 **/
public class GyhInvocationHandler implements InvocationHandler {
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println(method.getName()+"调用数据库查询"+method.getAnnotations()[0]);
		return null;
	}
}
