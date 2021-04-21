package aop.main;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect

public class LoggingAspect {
	@Before("execution* get*()")
	public void loggingAdvice()
	{
		System.out.println("writing log before method is executed");
	}

}
