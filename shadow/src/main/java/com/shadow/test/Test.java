package com.shadow.test;

import com.shadow.AppConfig;
import com.shadow.dao.TestDao;
import com.shadow.service.CityService;
import com.shadow.service.L;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac =new AnnotationConfigApplicationContext(AppConfig.class);
		ac.getBean(TestDao.class).dao();

		//目标对象被代理了，它在什么时候被代理了  初始化的时候就被代理了
		//目标对象哪里去了
		//map.getBean("key")
		L l = (L) ac.getBean("c");

		//在没有用AOP之前，对象是name="c",type = implement L（接口）、extend  CityService(类)
		//在引用AOP后，容器中找不到CityService类的bean，对象是name="c"，type = implement L、extend ？，代理类继承了什么呢？
//		L l = (L) ac.getBean(CityService.class);//空的
		l.query();

	}
}
