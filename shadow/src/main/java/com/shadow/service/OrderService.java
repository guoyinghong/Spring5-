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
	/**
	 * beanDefinition.setAutowireMode(0);//AUTOWIRE_NO
	 * AUTOWIRE_NO，默认使用的是无参构造
	 */
	public OrderService(){
		System.out.println("构造器："+0);
	}

	public OrderService(HomeService homeService){
		System.out.println("构造器："+1);
	}

	public OrderService(HomeService homeService,TestService testService){
		System.out.println("构造器："+2);
	}

	private OrderService(HomeService homeService,TestService testService,TestService testService2){
		System.out.println("构造器："+3);
	}



	//	@Autowired //@Autowired 是不需要该属性的set方法的，Spring是通过反射进行装配的
	HomeService homeService;

	public HomeService getHomeService() {
		return homeService;
	}


	//注入方式为0时不加@Autowired 注解只通过set方法不能注入，
	// 但是将注入方式改为set方式注入(beanDefinition.setAutowireMode(1);)便可注入
	//甚至没有该属性也可以调用到set方法。
	//byName->writeMethod(规则：1、set开头 2、set方法里的参数必须在Spring容器中 3、set方法后边的名字必须和容器中bean的名字一样)
	//也是通过反射注入的，method.invoke()方法
	public void setHomeService(HomeService homeService) {
		this.homeService = homeService;
	}
}
