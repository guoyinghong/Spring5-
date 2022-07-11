package com.shadow.service;

import com.shadow.dao.TestDao;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author: guoyinghong
 * @date: 2022/7/5 下午3:53
 * @Description:
 **/
@Component
public class TestService
//implements InitializingBean
{
	public TestService() {
//		System.out.println("TestService constructor");
	}

	/**
	 * initialization callback和destruction callback 组成了Spring的 lifestyle callbacks
	 */
//	@PostConstruct  生命周期回调 lifestyle callback
	public void init(){
		System.out.println("init");
	}

//	@Override //生命周期回调第二种方法 实现InitializingBean
	public void afterPropertiesSet() throws Exception {
		System.out.println("init afterPropertiesSet");
	}

	//@PreDestroy    销毁（context.close）的时候执行
	public void preDestroy(){
		System.out.println("destroy");
	}




	@Autowired
	TestDao testDao;

	public void query() {
		System.out.println(testDao.query());
	}
}
