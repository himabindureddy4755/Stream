package basics.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Car implements Vehicle{
	@Autowired
	Tyre tyre;
	public Tyre getTyre()
	{
		return tyre;
		
	}
	public void setTyre(Tyre tyre)
	{
		this.tyre = tyre;
	}


	public void ride()
	{
		System.out.println("driving car"+tyre);
	}
}
