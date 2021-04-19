package constructor.injection;

import java.util.Iterator;
import java.util.List;

public class Employee {
	private int id;
	private String name;
	private Address address;
	private List<String>tasks;

	public Employee() {
		System.out.println("default constructor");
	}

	public Employee(int id, String name,List<String>tasks) {
		
		this.id = id;
		//this.name =name;
		this.address = address;
		this.tasks = tasks;
	}
public Employee( String name) {
		
		
		this.name =name;
		System.out.println("String constructor");
	}
	public Employee(int id) {
		super();
		this.id = id;
		System.out.println("integer constructor");
	}
	
	void show()
	{
		System.out.println(id+""+name);
		  
	    //System.out.println(address.toString());  
	    System.out.println("tasks are:");
	    Iterator<String> itr=tasks.iterator();  
	    while(itr.hasNext()){  
	        System.out.println(itr.next());  
	    }  
	}

}
