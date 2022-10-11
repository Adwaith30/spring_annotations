package com.selenium.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("collegeBean")

@Component
public class College {
	
	@Value("St.Aloysius")
	//@Value("${college.Name}")
	private String collegeName;
	
	
	//@Autowired
	private Principal principal;
	//@Autowired
	private Teacher teacher;
	
//	public College(Principal principal) {   //by using the constructor we do the injection
//		this.principal = principal;
//	}
	
	@Autowired
	@Qualifier("mathTeacher")
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}



	@Autowired
	public void setPrincipal(Principal principal) {   //by using setters we do the injection
		this.principal = principal;
	}

	
	

	public void test()
	{
		principal.principalInfo();
		System.out.println("Just testing this method as well as this class");
		teacher.teach();
		System.out.println("My PU College name is :" +collegeName);
	}

	
	
}
