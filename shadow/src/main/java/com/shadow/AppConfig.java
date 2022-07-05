package com.shadow;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configurable
@ComponentScan("com.shadow")
@EnableAspectJAutoProxy
//@EnableAspectJAutoProxy(proxyTargetClass = true)   //代理cglib，使用继承实现的代理
public class AppConfig {

}
