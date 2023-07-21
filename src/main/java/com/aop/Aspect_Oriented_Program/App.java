package com.aop.Aspect_Oriented_Program;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.Aspect_Oriented_Program.Services.Login;
import com.aop.Aspect_Oriented_Program.Services.LoginImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config.xml");
    	Login login=(Login)applicationContext.getBean("login",Login.class);
    	
    	login.login();
    	
        
    }
}
