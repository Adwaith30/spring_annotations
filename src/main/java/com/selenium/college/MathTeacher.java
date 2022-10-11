package com.selenium.college;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class MathTeacher implements Teacher {

	public void teach() {
		System.out.println("Hello i am your math teacher");
		System.out.println("complete the work by tomorrow");

	}

}
