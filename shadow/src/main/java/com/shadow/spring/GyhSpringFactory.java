package com.shadow.spring;

import com.shadow.service.TestService;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author: guoyinghong
 * @date: 2022/7/7 下午4:45
 * @Description:
 **/
@Component
public class GyhSpringFactory implements FactoryBean {
	@Override
	public Object getObject() throws Exception {
		return null;
	}

	@Override
	public Class<?> getObjectType() {
		return null;
	}
}
