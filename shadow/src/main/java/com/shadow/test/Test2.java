package com.shadow.test;

import com.shadow.AppConfig;
import com.shadow.service.L;
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

		//spring 扫描cityService
//		GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
//		beanDefinition.setBeanClassName("test");
//		beanDefinition.setBeanClass(TestService.class);
//		beanDefinition.setScope("singleton");
//		System.out.println(context.getBean("test"));

		L test = (L) context.getBean("test");
		L test2 = (L) context.getBean("test");
		System.out.println(test == test2);
	}

}
