package com.ty.test_spring_core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
public static void main(String[] args) {
	ApplicationContext app=new ClassPathXmlApplicationContext("my_bean_conf.xml");
	Student student=(Student)app.getBean("myStudent");
	student.run();
}
}
