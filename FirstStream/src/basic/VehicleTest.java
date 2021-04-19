package basic;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class VehicleTest {
public static void main(String[] args)
{
	Resource resource = new ClassPathResource("Stream.xml");
	BeanFactory beanFactory = new XmlBeanFactory(resource);
	Vehicle vehicle = (Vehicle) beanFactory.getBean("Vehicle");
	vehicle.drive();
	
	//Car car = new Car();
	//car.drive();
}
}