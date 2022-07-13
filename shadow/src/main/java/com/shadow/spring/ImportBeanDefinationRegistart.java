package com.shadow.spring;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author: guoyinghong
 * @date: 2022/7/11 下午4:12
 * @Description: 为了实例化一个 GyhSpringFactoryBean。如果用xml配置可以不用这个类
 **/
public class ImportBeanDefinationRegistart implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		//给你一个包名 com.shadow，得到所有的类
		//for()
		BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(GyhSpringFactoryBean.class);
		GenericBeanDefinition genericBeanDefinition = (GenericBeanDefinition) builder.getBeanDefinition();
		registry.registerBeanDefinition("testDao",genericBeanDefinition);

		//通过构造方法进行注入时才会使用有参构造，但有参构造方法中的参数是class类型。spring内部会检验注入类型，如果是class类型会跳过。在XML中可以通过来传入，如果不使用XML，当一个类变成一个BeanDefinition时，它会用来描述这个类，比如说这个类的注入模型、类的名字，已经这个类被new出来后要传的参数
		genericBeanDefinition.getConstructorArgumentValues().addGenericArgumentValue("com.shadow.dao.TestDao");
		//默认使用的是无参构造方法，如果想使用有参构造，将mapper的类型传进去，需要用构造方法方式注入
		genericBeanDefinition.setAutowireMode(3);
	}
}
