package com.shadow.service;

import com.shadow.test.Test;
import org.springframework.stereotype.Component;

/**
 * @author: guoyinghong
 * @date: 2022/7/6 下午5:17
 * @Description:
 **/
@Component
public class OrderService {
	public OrderService(){
		System.out.println(0);
	}

	public OrderService(TestService testService){
		System.out.println(1);
	}

	public OrderService(CityService cityService,TestService testService){
		System.out.println(2);
	}

	public OrderService(CityService cityService,TestService testService,TestService testService2){
		System.out.println(3);
	}
}
