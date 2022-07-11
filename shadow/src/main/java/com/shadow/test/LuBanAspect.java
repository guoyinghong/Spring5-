package com.shadow.test;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Component
@Aspect
public class LuBanAspect {

	@Pointcut("execution(* com.shadow.dao..*.*(..))") //切入点
	public void pointCutdao(){
	}

	@Pointcut("execution(* com.shadow.service..*.*(..))&&!pointCutAgs()") //切入点
	public void pointCutservice(){
	}


	@Pointcut("this(com.shadow.service.CityService)") //切入点
	public void pointCutthis(){
	}

	@Pointcut("target(com.shadow.service.CityService)") //切入点
	public void pointCuttarget(){
	}

	@Pointcut("@annotation(com.shadow.test.Luban)") //切入点
	public void pointCutAnnotation(){
	}

	@Pointcut("args(java.lang.String)") //切入点
	public void pointCutAgs(){
	}

	@Before("pointCutservice()")  //通知
	public void advice(){
		System.out.println("---------通知通知通知---------");
	}


	//环绕通知
	@Around("com.shadow.test.LuBanAspect.pointCutAnnotation()")
	public void around(ProceedingJoinPoint pjp) throws Throwable {
		pjp.getArgs();//可以接收到连接点中的参数并根据业务逻辑进行修改
		System.out.println("aop-----before");
		pjp.proceed();//将修改后的参数传过去
		System.out.println("aop-----after");
	}
}
