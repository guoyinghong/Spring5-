package com.shadow;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configurable
@ComponentScan("com.shadow")
@GyhScan

//@EnableAspectJAutoProxy
//@MapperScan("com.shadow.dao")  //扫描mapper映射器
//@EnableAspectJAutoProxy(proxyTargetClass = true)   //代理cglib，使用继承实现的代理
public class AppConfig {

	@Bean
	public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource){
		SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
		sessionFactoryBean.setDataSource(dataSource);
		return sessionFactoryBean;
	}

	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/double_source?useSSL=true&useUnicode=true&characterEncoding=utf8&serverTimezone=Asia/Shanghai");
		dataSource.setUsername("root");
		dataSource.setPassword("Guomysql_1031");
		return dataSource;
	}
}
