package com.selenium.college;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.selenium.college")
//@PropertySource("classpath:college-info.properties")
public class collegeConfig {
	
	
	
	
//	@Bean
//	public Teacher mathTeacherBean()
//	{
//		return new MathTeacher();
//	}
//	
//	
//	@Bean
//	public Principal principalBean()
//	{
//		return new Principal();
//	}
//	
//
//	@Bean
//	public College collegeBean() //=>collegeBean will be your bean id
//	{
//		
//		//College college=new College(principalBean());
//		College college=new College();
//		  //or we can end in single line by => return new College();
//		college.setPrincipal(principalBean());
//		college.setTeacher(mathTeacherBean());
//		return college; 
//	}
}
