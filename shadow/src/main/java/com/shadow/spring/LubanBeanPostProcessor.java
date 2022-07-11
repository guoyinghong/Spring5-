package com.shadow.spring;

import com.shadow.service.CityService;
import com.shadow.service.HomeService;
import com.shadow.service.TestService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

/**
 * @author: guoyinghong
 * @date: 2022/7/5 下午4:04
 * @Description:
 **/
@Component
public class LubanBeanPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("自定义BeanFactoryPostProcessor");
		//BeanFactoryPostProcessor 可以在bean初始化之前修改bean的一些属性
//		GenericBeanDefinition beanDefinition = (GenericBeanDefinition) beanFactory.getBeanDefinition("test");
//		beanDefinition.setScope("prototype");


		GenericBeanDefinition beanDefinition = (GenericBeanDefinition) beanFactory.getBeanDefinition("orderService");
		System.out.println("AutowireMode:"+beanDefinition.getAutowireMode());
		//设置为3时，会去找公共方法中参数最多，并且每个参数都在Spring容器中的构造方法
		beanDefinition.setAutowireMode(3);//AUTOWIRE_CONSTRUCTOR
//		beanDefinition.setAutowireMode(1);//AUTOWIRE_BY_NAME

		/**
		 * 如果有@Autowired注解,默认是通过反射进行自动装配的，和set方法无关
		 */
//		try {
//			TestService testService = new TestService();
//			HomeService homeService = new HomeService();
//			Field field  = TestService.class.getField("homeService");
//			field.set(testService,homeService);
//		} catch (NoSuchFieldException | IllegalAccessException e) {
//			e.printStackTrace();
//		}



	}
}
