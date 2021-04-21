package basics.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("stream.xml");
		//Vehicle v =(Car)context.getBean("car");
		//v.ride();
		Tyre tyre =(Tyre)context.getBean("Tyre");
		System.out.println(tyre);
	}

}
