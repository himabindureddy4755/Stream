package aop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aspect.xml");
		ShapeService shapeser = context.getBean("shapeser",ShapeService.class);
		System.out.println(shapeser.getTriangle().getName());
	}

}
