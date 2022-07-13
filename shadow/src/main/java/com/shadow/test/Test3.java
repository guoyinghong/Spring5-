package com.shadow.test;

import com.shadow.AppConfig;
import com.shadow.dao.TestDao;
import com.shadow.service.TestService;
import org.apache.ibatis.session.SqlSession;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Proxy;

/**
 * @author: guoyinghong
 * @date: 2022/7/7 下午4:47
 * @Description: mybatis继承Spring 测试类
 **/
public class Test3 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		context.getBean(TestService.class);

		//模拟mybatis
		TestDao testDao = (TestDao) Proxy.
				newProxyInstance(Test2.class.getClassLoader(), new Class[]{TestDao.class}, new GyhInvocationHandler());

		testDao.query();

		//这种方法为什么mybatis不用
//		UserController controller = new UserController() ;
//		context.getBeanFactory().registerSingleton("userController",controller);


		//看看mybatis源码
//		SqlSession sqlSession = null;
//		TestDao testDao = sqlSession.getMapper(TestDao.class);

		//测试FactoryBean注入Spring
		context.getBean(TestDao.class).query();


	}
}
