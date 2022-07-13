package com.shadow;

import com.shadow.spring.GyhSpringFactoryBean;
import com.shadow.spring.ImportBeanDefinationRegistart;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author: guoyinghong
 * @date: 2022/7/11 下午4:51
 * @Description: 模拟 @MapperScan
 **/

@Retention(RetentionPolicy.RUNTIME)
//导入ImportBeanDefinationRegistart类
@Import(ImportBeanDefinationRegistart.class)
public @interface GyhScan {
}
