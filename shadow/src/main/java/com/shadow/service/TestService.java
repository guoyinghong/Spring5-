package com.shadow.service;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author: guoyinghong
 * @date: 2022/7/5 下午3:53
 * @Description:
 **/
@Component("test")
public class TestService {
	public TestService() {
		System.out.println("constructor");
	}

	@PostConstruct
	public void init(){
		System.out.println("init");
	}
}
