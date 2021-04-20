package basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component


public class Car implements Vehicle {
	
	public void drive()
	{
		System.out.println("car is being driven");
	}

}
