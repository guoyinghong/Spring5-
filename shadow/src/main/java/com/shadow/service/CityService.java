package com.shadow.service;

import com.shadow.test.Luban;
import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.stereotype.Component;

@Component("c")
public class CityService implements L{
	public CityService() {
		System.out.println("CityService构造器！！！观察目标对象被创建");

	}


//	$proxyxxx implements L   代理类

	@Override
	@Luban
	public void query() {
		System.out.println("---------queryDB----------");
	}

	@Override
	public void query1(String n) {
		System.out.println("---------query111DB----------");

	}
	@Override
	public void query2(String n, String m) {
		System.out.println("---------query222DB----------");

	}
}
