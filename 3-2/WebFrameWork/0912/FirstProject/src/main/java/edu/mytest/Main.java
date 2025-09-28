package edu.mytest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws Exception { 
		// classpath에 있는 hello.xml을 읽어옴
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("hello.xml");	

		// helloWorldService 빈을 가져옴
		HelloWorldService  helloService = context.getBean("helloWorldService", HelloWorldService.class);
		helloService.sayHello();	
	}

}
