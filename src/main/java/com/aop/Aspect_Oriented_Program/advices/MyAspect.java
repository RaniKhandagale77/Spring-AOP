package com.aop.Aspect_Oriented_Program.advices;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	@Before("execution(* com.aop.Aspect_Oriented_Program.Services.LoginImpl.login())")
	
	public void executeBeforeLogin() {
		System.out.println("User is being authenticated.....");
	}

}
