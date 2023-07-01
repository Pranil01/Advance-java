package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.MyUser;

public class TestSpringDemo {

	
	public static void main(String[]args) {
//		XmlBeanFactory bf=new XmlBeanFactory(new ClassPathResource("Springconfig.xml"));
		/*
		 * System.out.println("before getbean"); HelloWorld
		 * hbean=(HelloWorld)bf.getBean("hw"); System.out.println("after getbean");
		 * hbean.sayHello();
		 */
		 
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Springconfig.xml");
		MyUser u1=(MyUser) ctx.getBean("u1");
		 System.out.println(u1);
		
	}
}
