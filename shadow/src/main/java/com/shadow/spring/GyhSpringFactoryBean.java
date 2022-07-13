package com.shadow.spring;

import com.shadow.test.GyhInvocationHandler;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

import java.lang.reflect.Proxy;

/**
 * @author: guoyinghong
 * @date: 2022/7/7 下午4:45
 * @Description: 模拟 mybatis 的 MapperFactoryBean
 **/
//@Component
public class GyhSpringFactoryBean implements FactoryBean {
	//mapper 类
	Class mapperInterface;

	public GyhSpringFactoryBean() {
		System.out.println("GyhSpringFactoryBean 0号构造");
	}

	public GyhSpringFactoryBean(Class mapperInterface) {
		System.out.println("GyhSpringFactoryBean 1号构造");
		this.mapperInterface = mapperInterface;

	}

	@Override
	public Object getObject() throws Exception {

		//不能写死，不然每个FactoryBean只能创建一个类
//		TestDao testDao = (TestDao) Proxy.
//				newProxyInstance(GyhSpringFactoryBean.class.getClassLoader(), new Class[]{TestDao.class}, new GyhInvocationHandler());
//		return testDao;

		Object object =  Proxy.newProxyInstance(GyhSpringFactoryBean.class.getClassLoader(), new Class[]{mapperInterface}, new GyhInvocationHandler());
		return object;
	}

	@Override
	public Class<?> getObjectType() {
		return mapperInterface;
	}


	public void setMapperInterface(Class mapperInterface) {
		this.mapperInterface=mapperInterface;
	}
}
