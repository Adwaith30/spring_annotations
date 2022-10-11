package com.selenium.college;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Client {

	public static void main(String[] args) {
		
	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(collegeConfig.class);
	//ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
	//System.out.println("bean.xml file is loaded");
	College college=applicationContext.getBean("college",College.class);
	System.out.println("Hello people the bean is fetched and stored int the container object" +college);
	college.test();
	((AnnotationConfigApplicationContext)applicationContext).close();
	
	
	}
}
