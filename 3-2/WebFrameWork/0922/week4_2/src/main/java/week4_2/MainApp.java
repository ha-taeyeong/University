package week4_2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		ExInter ex = ctx.getBean("exc", ExInter.class);
		ex.process();
		ex.print();
		ctx.close();
	}

}
