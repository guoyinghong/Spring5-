package com.shadow.test;

import com.shadow.AppConfig;
import com.shadow.service.HomeService;
import com.shadow.service.L;
import com.shadow.service.OrderService;
import com.shadow.service.TestService;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: guoyinghong
 * @date: 2022/7/5 下午3:53
 * @Description:
 **/

public class Test2 {


	public static void main(String[] args) {
		// init spring环境
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		//spring 扫描test
//		GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
//		beanDefinition.setBeanClassName("test");
//		beanDefinition.setBeanClass(TestService.class);
//		beanDefinition.setScope("singleton");
//		System.out.println(context.getBean("test"));

//		Object test = context.getBean("testService");
//		Object test2 = context.getBean("testService");
//		System.out.println(test == test2);


		//可以打印
//		System.out.println(context.getBean(OrderService.class).getHomeService());


		//这种方法为什么mybatis不用
//		context.getBeanFactory().registerSingleton("",);


		context.getBean(TestService.class).query();
	}

}
