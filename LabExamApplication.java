package com.itsc.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class LabExamApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentRepo student_repo = context.getBean("stu", StudentRepo.class);
		student_repo.getName("Able");
		student_repo.getEmail("abelseyoum.swe@gmail.com");
	}

}
