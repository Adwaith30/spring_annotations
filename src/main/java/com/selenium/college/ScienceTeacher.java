package com.selenium.college;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class ScienceTeacher implements Teacher {

	public void teach() {
		System.out.println("Hello i am your Science teacher");
		System.out.println("complete the work by tomorrow");

	}

}
